package in.ashokit.binding;

import lombok.Data;

@Data
public class CovidData {
	private String country;
	private String code;
	private String confirmed;
	private String recovered;
	private String critical;
	private String deaths;
	private String latitude;
	private String longitude;
	private String lastChange;
	private String lastUpdate;
}
