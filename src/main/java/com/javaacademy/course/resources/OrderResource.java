package com.javaacademy.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaacademy.course.entities.Order;
import com.javaacademy.course.services.OrderService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value="/orders")
public class OrderResource {

	@Autowired
	private OrderService service;
	
	//metodo end pois para acessar os usuarios
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//end point para buscar um funcionario por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
