package in.ashokit.rest;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseDetails {
	@GetMapping("/course/{name}")
	public ResponseEntity<String> getCourseDetails(@PathVariable String name) {
		String msg = null;
		if ("SBMS".equals(name)) {
			msg = name + " will start 3rd week";
		} else if ("Hibernate".equals(name)) {
			msg = name + " will start 4th week";
		} else {
			msg = "please contact .. for  ::" + name;
		}

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@GetMapping("/courseDetails/{name}/{trainer}/{mode}")
	public ResponseEntity<String> getCourseInfo(@PathVariable String name, @PathVariable String trainer,
			@PathVariable String mode) {
		String msg = null;
		if ("SBMS".equals(name)) {
			msg = name + " will start 3rd week " + trainer + " " + mode;
		} else if ("Hibernate".equals(name)) {
			msg = name + " will start 4th week " + trainer + " " + mode;
		} else {
			msg = "please contact ..";
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}
