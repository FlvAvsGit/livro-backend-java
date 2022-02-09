package com.backend.java.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.java.entities.User;
import com.backend.java.repositories.UserRepository;
import com.backend.java.services.exception.ObjectNotFndException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFndException("Objeto não encontrado. id: " + id + ",Tipo: " + User.class.getName()));
	}

//	public List<UserDto> findAll() {
//		List<User> user = userRepository.findAll();
//		return user.stream().map(UserDto::convert).collect(Collectors.toList());
//	}

}
