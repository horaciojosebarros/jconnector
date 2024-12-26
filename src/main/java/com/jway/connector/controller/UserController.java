package com.jway.connector.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jway.connector.dto.UserDto;
import com.jway.connector.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<UserDto> listAll() {
		return userService.findall();
	}
	
	@PostMapping
	public UserDto createUser(@RequestBody UserDto userDto) {
		return userService.save(userDto);
		
	}

}
