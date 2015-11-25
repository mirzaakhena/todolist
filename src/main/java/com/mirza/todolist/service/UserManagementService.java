package com.mirza.todolist.service;

import java.util.List;

import com.mirza.todolist.dto.UserDto;
import com.mirza.todolist.model.User;

public interface UserManagementService {

	public void register(UserDto dto);

	public List<User> getAll();

}
