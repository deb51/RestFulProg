package in.ashokit.resBinding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlRootElement
public class Ticket {

	private Integer pnr;
	private String ticketStatus;
	private Double tocketAmount;
}
