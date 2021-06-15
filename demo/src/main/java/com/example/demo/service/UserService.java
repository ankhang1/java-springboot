package com.example.demo.service;

import com.example.demo.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserEntity> getAllUser();
    void saveUser(UserEntity user);
    void deleteUser(Integer id);
    Optional<UserEntity> findUserById(Integer id);
}
