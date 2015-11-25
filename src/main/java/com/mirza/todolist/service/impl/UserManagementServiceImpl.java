package com.mirza.todolist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mirza.todolist.dao.UserDao;
import com.mirza.todolist.dto.UserDto;
import com.mirza.todolist.model.User;
import com.mirza.todolist.service.UserManagementService;

@Service
@Transactional(readOnly = true)
public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	UserDao userDao;

	@Transactional(readOnly = false)
	@Override
	public void register(UserDto dto) {

		User user = new User();
		user.setNama(dto.getNama());
		userDao.save(user);

	}

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}

}
