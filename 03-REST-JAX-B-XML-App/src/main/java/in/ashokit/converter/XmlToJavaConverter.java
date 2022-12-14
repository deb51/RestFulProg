package in.ashokit.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;

import javax.xml.bind.Unmarshaller;

import in.ashokit.Beans.Person;

public class XmlToJavaConverter {
	public static void main(String[] args) throws Exception {

		JAXBContext context = JAXBContext.newInstance(Person.class);

		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Person person = (Person) unmarshaller.unmarshal(new File("person.xml"));

		System.out.println(person);
	}
}
