package com.dataart.controller;

import com.dataart.model.User;
import com.dataart.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;

/**
 * Created by Роман on 06.11.2017.
 */

@RestController
@RequestMapping("/auth")
public class UserController {

    private static final Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @GetMapping("/welcome")
    public String welcome(){
        logger.debug("...start welcome method (testing)");
        return "Welcome, user (testing)";
    }

   /* @GetMapping("/login")
    public String login(){
        logger.debug("...start welcome method");
        return "Welcome, user";
    }


    @PostMapping("/reqistration")
    public String reqistration(@RequestBody User user){
        userService.saveUser(user);
        return "redirect:/welcome";
    }*/

    @GetMapping(value = "/user", produces = "application/json")
    public User getUser(Principal principial) {

        if (principial != null) {

            logger.info("Got user info for login = " + principial.getName());

            if (principial instanceof AbstractAuthenticationToken){
                return (User) ((AbstractAuthenticationToken)
                        principial).getPrincipal();
            }
        }

        return null;

    }

    @PostMapping(value = "/register", produces = "application/json")
    public ResponseEntity <User> registration(User user) {


        return new ResponseEntity<User>(user,HttpStatus.CREATED);

    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public void logout(HttpServletRequest rq, HttpServletResponse rs) {

        SecurityContextLogoutHandler securityContextLogoutHandler =
                new SecurityContextLogoutHandler();
        securityContextLogoutHandler.logout(rq, rs, null);

    }



}
