package com.mirza.todolist.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 30)
	private String nama;

	@OneToMany
	private List<Note> notes;

}
