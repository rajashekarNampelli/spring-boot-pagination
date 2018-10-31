package com.paginationdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paginationdemo.exceptions.MyResourceNotFoundException;
import com.paginationdemo.model.Student;
import com.paginationdemo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/student/get", params = { "page", "size" }, method = RequestMethod.GET)
	public Page<Student> findPaginated(@RequestParam("page") int page, @RequestParam("size") int size)
			throws RuntimeException {

		Page<Student> resultPage = studentService.findAllPageable(PageRequest.of(page, size));
		if (page > resultPage.getTotalPages()) {
			throw new MyResourceNotFoundException();
		}
		return resultPage;
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public Iterable<Student>  returnAllPages() throws RuntimeException {

		Iterable<Student> resultPage = studentService.findAllPages();
	
		return resultPage;
	}

}