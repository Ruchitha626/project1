package com.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Questions;

public interface QuestionsDao extends JpaRepository<Questions, Integer>{

}
