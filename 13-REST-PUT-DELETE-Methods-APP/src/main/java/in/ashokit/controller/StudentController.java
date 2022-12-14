package in.ashokit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@PutMapping(value = "/update/{sid}")
	public ResponseEntity<String> updateRecord(@PathVariable Integer sid){
		
		//logic to delete
		String msg="Student with id :"+sid+" got update sucessfully";
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete/{sid}")
	public ResponseEntity<String> deleteRecord(@PathVariable Integer sid){
		
		//logic to delete
		String msg="Student with id :"+sid+" got delete sucessfully";
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
