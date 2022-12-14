package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyRestController {

	@GetMapping
	public ResponseEntity<String> welcomeMsg() {
		String msg = "Debasish Das";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@GetMapping("/greet")
	public ResponseEntity<String> greetMsg() {
		String msg = "Good Morning";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<String> doWorkMsg() {
		String msg = "work in progress";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}
