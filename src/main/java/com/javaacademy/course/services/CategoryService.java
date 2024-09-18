package com.javaacademy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaacademy.course.entities.Category;
import com.javaacademy.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	//buscar todos os usuarios
	public List<Category> findAll(){
		
		return repository.findAll();
	}
	
	//buscar usuarios por id
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
