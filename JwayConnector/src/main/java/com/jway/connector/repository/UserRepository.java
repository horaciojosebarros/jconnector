package com.jway.connector.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jway.connector.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
