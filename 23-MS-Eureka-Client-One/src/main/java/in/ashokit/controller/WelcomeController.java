package in.ashokit.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String getMsg() {
		return "welcome Debasish";
	}
}
