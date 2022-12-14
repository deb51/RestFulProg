package in.ashokit.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.beans.Student;
import in.ashokit.service.StudentService;

@RestController
public class RestApiMethod {
	

	@Autowired
	private StudentService service;

	@GetMapping(value={"/student"},produces={"application/json","application/xml"})
	public ResponseEntity<Student> getDetails(Student student) {
	
		Student stu=service.getStudent();
	
		return new ResponseEntity<>(stu,HttpStatus.OK);
	}
}
