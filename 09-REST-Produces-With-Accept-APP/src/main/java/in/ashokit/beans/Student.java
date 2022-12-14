package in.ashokit.beans;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private Integer studentId;
	private String studentName;
	private Integer studentAge;
}
