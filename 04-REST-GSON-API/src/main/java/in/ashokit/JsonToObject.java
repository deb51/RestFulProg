package in.ashokit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class JsonToObject {
	public static void main(String[] args) throws Exception {


		Gson gson=new Gson();
		Person person=gson.fromJson(new FileReader("person.json"), Person.class);
		System.out.println(person);
	
	}
}
