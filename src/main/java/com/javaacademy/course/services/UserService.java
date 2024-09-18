package com.javaacademy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaacademy.course.entities.User;
import com.javaacademy.course.repositories.UserRepository;

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
		return obj.get();
	}
	
	//Retornar o usuario salvo
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	//deleçao do usuario
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
