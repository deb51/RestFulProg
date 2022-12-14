package in.ashokit.Beans;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	@JsonProperty("PAddress")
	private String personAddress;
	@JsonProperty("PDist")
	private String personDist;
	@JsonProperty("PCode")
	private Long pinCode;

}
