package in.ashokit.reqBinding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketRequestBinding {
	 private String doj;
	 private String fname;
	 private String from;
	 private String lname;
	 private String to;
}
