package in.debasish;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.debasish.service.FlightService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		FlightService flight = context.getBean(FlightService.class);
		flight.getFlight1();
		flight.getFlight2();
	}

}
