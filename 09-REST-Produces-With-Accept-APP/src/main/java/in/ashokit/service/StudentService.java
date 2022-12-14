package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.beans.Student;

@Service
public class StudentService {
	public Student getStudent() {


		Student student=new Student(101, "deepak", 27);
		return student;
	}
}
