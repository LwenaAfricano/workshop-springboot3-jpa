package com.javaacademy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaacademy.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
