package com.javaacademy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaacademy.course.entities.OrderItem;
import com.javaacademy.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
