package com.backend.java.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.java.dto.UserDto;
import com.backend.java.entities.User;
import com.backend.java.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDto> getUser(@PathVariable Long id) {
		User obj = userService.findById(id);
		return ResponseEntity.ok().body(new UserDto(obj));
	}
	@GetMapping
	public ResponseEntity<List<UserDto>> getAllUser() {
		List <User> user = userService.findAll();
		List<UserDto> userDto =     user.stream().map(obj -> new UserDto(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(userDto);
	}
	
	@DeleteMapping(value = "/{id}")
	public UserDto deleteUser(@PathVariable Long id) {
		Math.sin(0);
		userService.deleteId(id);
		return null;
	}
}
