package in.ashokit.repo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bean.Student;

@RestController
public class StudentRepository {

	@PostMapping(value={"/student"},consumes={"application/json","application/xml"})
	public ResponseEntity<String> addStudent(@RequestBody Student student){
		System.out.println(student);
		String msg="Saved data";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
