package com.paginationdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private long studentId;
	@Column(nullable = false)
	private String studentName;
	@Column(nullable = false)
	private String gender;
	@Column(nullable = false)
	private Integer age;

	public Student() {
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(long studentId, String studentName, String gender, int age) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", gender=" + gender + ", age="
				+ age + "]";
	}

}
