package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorRest {

	
	@GetMapping("/wish")
	public String getWish() {
		return "Good morning Debasish..";
	}
}
