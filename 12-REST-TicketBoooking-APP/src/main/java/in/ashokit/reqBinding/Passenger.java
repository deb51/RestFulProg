package in.ashokit.reqBinding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlRootElement
public class Passenger {

	private String fname;
	private String lname;
	private String from;
	private String to;
	private String doj;
}
