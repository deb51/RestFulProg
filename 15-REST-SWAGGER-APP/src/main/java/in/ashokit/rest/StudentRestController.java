package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

	@GetMapping(value = "/greet/{name}")
	public String welcomeMsg(@PathVariable String name) {
		String msg="Hello... "+name+" How are You..";
		return msg;
	}
	
}
