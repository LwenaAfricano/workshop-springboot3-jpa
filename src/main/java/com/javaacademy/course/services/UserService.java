package com.javaacademy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaacademy.course.entities.User;
import com.javaacademy.course.repositories.UserRepository;
import com.javaacademy.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	//buscar todos os usuarios
	public List<User> findAll(){
		
		return repository.findAll();
	}
	
	//buscar usuarios por id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	//Retornar o usuario salvo
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	//deleçao do usuario
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	//atualizar um dado usuario
	public User upDate(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());


	}
}
