package com.javaacademy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaacademy.course.entities.User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public interface UserRepository extends JpaRepository<User, Long>{

}
