package com.jway.connector.dto;

import lombok.Data;

@Data
public class UserDto {

	private String login;

	private String name;

	public UserDto(String login, String name) {
		this.login = login;
		this.name = name;
		
	}

	public UserDto() {

	}
}
