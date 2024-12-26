package com.jway.connector.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jway.connector.dto.UserDto;
import com.jway.connector.model.User;
import com.jway.connector.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@AllArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public List<UserDto> findall() {
		
		List<User> lista = userRepository.findAll();
		
		List<UserDto> dtos = new ArrayList<UserDto>();
		for (User user : lista) {
			UserDto dto = new UserDto(user.getName(), user.getLogin()); 
			dtos.add(dto);
		}
		return dtos;
	}


	public UserDto save(UserDto userDto) {
		User user = new User(userDto.getLogin(), userDto.getName());
		user = userRepository.save(user);
		return new UserDto(user.getLogin(), user.getName());
	}
	
}
