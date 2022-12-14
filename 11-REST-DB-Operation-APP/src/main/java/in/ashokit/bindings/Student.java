package in.ashokit.bindings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="student_dtls")
@XmlRootElement
public class Student {

	@Id
	@Column(name="stu_id")
	private Integer studentId;
	
	@Column(name="stu_name")
	private String studentName;
	
	@Column(name="stu_email")
	private String studentEmail;
	
	@Column(name="stu_age")
	private Integer studentAge;
}

/*
 * { "studentId":103, "studentName":"Ram", "studentEmail":"ram@gmail.com",
 * "studentAge":25
 * 
 * }
 */