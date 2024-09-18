package com.javaacademy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaacademy.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
