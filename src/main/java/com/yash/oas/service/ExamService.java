package com.yash.oas.service;

import java.util.List;

import com.yash.oas.entity.Exam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;



public interface ExamService {
	
	public List<Exam> getAllExam();
	public Exam getParticularExam( int id);
	public Exam addNewExam(Exam exam );
}
