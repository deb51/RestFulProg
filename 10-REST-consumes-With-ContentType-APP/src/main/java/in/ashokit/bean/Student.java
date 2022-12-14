package in.ashokit.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private Integer studentId;
	private String studentName;
	private Integer studentAge;
}
