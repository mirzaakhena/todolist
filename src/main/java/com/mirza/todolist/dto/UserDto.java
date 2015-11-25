package com.mirza.todolist.dto;

import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

	@Size(min = 1, max = 30)
	private String nama;

}
