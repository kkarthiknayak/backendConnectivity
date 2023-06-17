package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {

    User findUserById(Long id);

    User createUser(User user);

}