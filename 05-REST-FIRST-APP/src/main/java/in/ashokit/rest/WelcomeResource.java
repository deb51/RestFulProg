package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResource {

	public WelcomeResource() {
		System.out.println("WELCOME:::CONSTRUCT");
	}

	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg() {
		String resnonseMsg = "Welcome To Debasish World";
		return new ResponseEntity<String>(resnonseMsg, HttpStatus.OK);
	}
}
