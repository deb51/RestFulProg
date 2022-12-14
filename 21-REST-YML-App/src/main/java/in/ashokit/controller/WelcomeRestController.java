package in.ashokit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.props.AppliactionProperties;

@RestController
public class WelcomeRestController {

	/*
	 * @Value("${messages.welcomeMsg}") private String welcomeMsg;  //to get only Single value
	 */
	@Autowired
	private AppliactionProperties properties;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		 Map<String, String> messages = properties.getMessages();
		 String msg = messages.get("welcomeMsg");
		 return msg;
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		 Map<String, String> messages = properties.getMessages();
		 String msg = messages.get("greetingMsg");
		 return msg;
	
	}
	
}
