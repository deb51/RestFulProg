package in.ashokit.JSONBuilder;

import java.io.File;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.Beans.Address;
import in.ashokit.Beans.Person;

public class JSONConverter {

	public static void main(String[] args) throws Exception {
		
		Address add=new Address("UDALA","MBJ",(long) 757041);
		
		Person per=new Person("debasish",20, add);
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writerWithDefaultPrettyPrinter().writeValue((new File("Person.json")), per);
	}
}
