package com.javaacademy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaacademy.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
