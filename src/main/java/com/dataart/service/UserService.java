package com.dataart.service;

import com.dataart.entity.User;

import java.util.List;

/**
 * Created by Роман on 06.11.2017.
 */
public interface UserService {

    User findById(long id);

    User findByLogin(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    public boolean isUserExistByLogin(String login);

    void changePassword(User user);



    User getSenderByHeaderId (long id);

}
