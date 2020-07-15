package com.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyRepo;
import com.springboot.web.model.Quiz;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {
	private static ArrayList<Quiz> list = new ArrayList<Quiz>();
//
	@Autowired
	MyRepo repository;
	
	
	public List<Quiz> getAllQuizQuestions()
	{
		return repository.findAll();
	}
}
