package com.raj.DAO;

import com.raj.model.Student;

import java.util.List;

public interface StudentDao {
	
	public List<Student> getList();

	public void insertStudent(String fname, String lname, int age, String address);

	public void removeStudent(int id);

	public void changeAddress(int id, String address);
}
