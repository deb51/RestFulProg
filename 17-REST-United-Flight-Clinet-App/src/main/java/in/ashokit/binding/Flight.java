package in.ashokit.binding;

import lombok.Data;

@Data
public class Flight {
	private String code;
	private Long price;
	private String origin;
	private String destination;
	private String departureDate;
	private String planeType;
	private String airlineName;
	private Integer emptySeats;
}
