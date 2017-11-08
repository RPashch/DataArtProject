package com.dataart.service;

import com.dataart.model.User;

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

    public boolean isUserExist(User user);

}