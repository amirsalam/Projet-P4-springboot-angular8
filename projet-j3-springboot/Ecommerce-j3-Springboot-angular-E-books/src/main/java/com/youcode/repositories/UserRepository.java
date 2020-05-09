package com.youcode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youcode.entity.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
