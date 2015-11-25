package com.mirza.todolist.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mirza.todolist.model.User;

public interface UserDao extends JpaRepository<User, Long> {

}
