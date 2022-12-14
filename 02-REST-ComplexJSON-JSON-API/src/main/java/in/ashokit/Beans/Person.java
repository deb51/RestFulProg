package in.ashokit.Beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	private String personName;
	private Integer personAge;
	
	private Address add;
}
