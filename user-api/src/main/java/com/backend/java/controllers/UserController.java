package com.backend.java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

//	@GetMapping
//	public List<UserDto> getAllUsers() {
//		return userService.findAll();
//	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDto> getUser(@PathVariable Long id) {
		User obj = userService.findById(id);
        return ResponseEntity.ok().body(new UserDto(obj));
	}
}
