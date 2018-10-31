package com.paginationdemo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.paginationdemo.model.Student;

public interface StudentService {

	Page<Student> findAllPageable(Pageable pageable);

	Iterable<Student> findAllPages();
}