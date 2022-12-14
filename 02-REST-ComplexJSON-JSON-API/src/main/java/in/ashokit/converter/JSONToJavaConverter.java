package in.ashokit.converter;

import java.io.File;

import java.io.FileReader;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.Beans.Person;

public class JSONToJavaConverter {
	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		Person person = mapper.readValue(new FileReader(new File("Person.json")), Person.class);
		System.out.println(person);

	}
}
