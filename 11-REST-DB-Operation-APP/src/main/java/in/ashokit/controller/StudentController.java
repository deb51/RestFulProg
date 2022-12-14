package in.ashokit.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.Student;
import in.ashokit.repo.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository stuRepo;

	@PostMapping(value = "/add-student", consumes = { "application/json", "application/xml" })
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		String msg = null;

		Student save = stuRepo.save(student);

		System.out.println(student);

		if (save.getStudentId() != null) {
			msg = "Saved Data";
		} else {
			msg = "Failed..!!!";
		}
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

	@GetMapping(value = "/student/{studentId}", produces = { "application/json", "application/xml" })
	public ResponseEntity<Student> getStudentById(@PathVariable Integer studentId) {

		Optional<Student> optional = stuRepo.findById(studentId);

		if (optional.isPresent()) {
			Student student = optional.get();
			System.out.println(student);
			return new ResponseEntity<>(student, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping(value = "/studentAge", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<Student>> findByStudentAgeGreaterThanEquals(@RequestParam Integer studentAge) {

		List<Student> ageGreaterThanEquals = stuRepo.findByStudentAge(studentAge);

		return new ResponseEntity<>(ageGreaterThanEquals, HttpStatus.BAD_REQUEST);

	}

}
