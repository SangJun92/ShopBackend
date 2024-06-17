package com.example.shopbackend.service;

import com.example.shopbackend.model.Role;
import com.example.shopbackend.model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    // 새로운 사용자를 저장합니다.
    User saveUser(User user);

    // 사용자 이름으로 사용자를 찾습니다.
    Optional<User> findByUsername(String username);

    // 사용자의 역할을 변경합니다
    void changeRole(Role newRole, String username);

    // 모든 사용자를 조회합니다
    List<User> userAll();
}