package com.javaacademy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaacademy.course.entities.Order;
import com.javaacademy.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	// buscar todos os usuarios
	public List<Order> findAll() {

		return repository.findAll();
	}

	// buscar usuarios por id
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
