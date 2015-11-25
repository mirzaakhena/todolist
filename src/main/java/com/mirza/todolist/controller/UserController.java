package com.mirza.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mirza.todolist.dto.UserDto;
import com.mirza.todolist.service.UserManagementService;

@RestController
public class UserController {

	@Autowired
	private UserManagementService userManagementService;

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ResponseEntity<?> register(@RequestBody UserDto dto) {
		userManagementService.register(dto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ResponseEntity<?> getAll() {
		return new ResponseEntity<>(userManagementService.getAll(), HttpStatus.OK);
	}

}
