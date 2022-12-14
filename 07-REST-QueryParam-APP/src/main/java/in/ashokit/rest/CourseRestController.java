package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping("/course")
	public ResponseEntity<String> getCourseDetails(@RequestParam("name") String name) {
		String msg = null;
		if ("SBMS".equals(name)) {
			msg = name + "will start 3rd week";
		} else if ("Hibernate".equals(name)) {
			msg = name + "will start 4th week";
		} else {
			msg = "please contact ..";
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	@GetMapping("/courseDetails")
	public ResponseEntity<String> getCourseInfo(@RequestParam("cname") String name, @RequestParam String trainer,
			@RequestParam String mode) {
		String msg = null;
		if ("SBMS".equals(name)) {
			msg = name + " will start 3rd week "+trainer+" "+mode;
		} else if ("Hibernate".equals(name)) {
			msg = name + " will start 4th week "+trainer+" "+mode;
		} else {
			msg = "please contact ..";
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}
