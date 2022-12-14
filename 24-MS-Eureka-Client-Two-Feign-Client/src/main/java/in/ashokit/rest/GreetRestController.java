package in.ashokit.rest;

import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.client.WelcomeServiceClient;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeServiceClient welcomeServiceClient;

	@GetMapping("/greet")
	public String getGreetMsg() {
		String greetResp = "good morning..";
		String welcomeResp=welcomeServiceClient.invokeWelcomeService();
		
		StringJoiner joiner=new StringJoiner(",");
		joiner.add(welcomeResp);
		joiner.add(greetResp);
		
		return joiner.toString();
	}

}
