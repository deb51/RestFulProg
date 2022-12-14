package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.bindings.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	public List<Student> findByStudentAge(Integer studentAge);
	
	
	 

	
}
