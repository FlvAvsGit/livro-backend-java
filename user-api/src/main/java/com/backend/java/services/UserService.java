package com.backend.java.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.java.dto.UserDto;
import com.backend.java.entities.User;
import com.backend.java.repositories.UserRepository;
import com.backend.java.services.exception.ObjectNotFndException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<UserDto> findAll() {
		List<User> user = userRepository.findAll();
		return user.stream().map(UserDto::convert).collect(Collectors.toList());
	}

	public UserDto findById(Long id) {
		Optional<User> user = userRepository.findById(id);

//		UserDto userDto = UserDto.convert(user.get());
		return user.orElseThrow(
				() -> new ObjectNotFndException("Objeto não encontrado. id: " + id + ",Tipo: " + User.class.getName()));
	}

}
