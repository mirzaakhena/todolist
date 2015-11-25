package com.mirza.todolist.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Note {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 120)
	private String message;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@ManyToOne
	private User user;

}
