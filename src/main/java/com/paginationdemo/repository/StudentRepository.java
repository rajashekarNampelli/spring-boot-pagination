package com.paginationdemo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.paginationdemo.model.Student;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

}