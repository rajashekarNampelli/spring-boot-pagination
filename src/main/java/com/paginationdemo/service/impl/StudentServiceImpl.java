package com.paginationdemo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.paginationdemo.model.Student;
import com.paginationdemo.repository.StudentRepository;
import com.paginationdemo.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

	@Override
	public Page<Student> findAllPageable(Pageable pageable) {
		
		return studentRepository.findAll(pageable);
	}

	@Override
	public Iterable<Student> findAllPages() {
		return studentRepository.findAll();
	}

}

