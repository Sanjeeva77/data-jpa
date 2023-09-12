package cgg.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.springdatajpa.entities.Question;

public interface QuestionRepository  extends JpaRepository<Question,Integer>{

	}


