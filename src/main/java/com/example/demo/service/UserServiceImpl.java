package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserDTO;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import jakarta.persistence.NoResultException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUserById(Long id) {
        return userRepository.findById(id)
                .map(UserDTO::toModel)
                .orElseThrow(() -> new NoResultException(String.format("User with id:%d  not Found", id)));
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(UserDTO.of(user)).toModel();
    }

}
