package com.mirza.todolist.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mirza.todolist.model.Note;

public interface NoteDao extends JpaRepository<Note, Long> {

}
