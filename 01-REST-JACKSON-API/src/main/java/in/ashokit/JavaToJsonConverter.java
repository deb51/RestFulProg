package in.ashokit;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {

		AuthorDetails ad=new AuthorDetails("Debasish", 10);
		Book book = new Book(101, "Spring", 541.00,ad);

		ObjectMapper mapper = new ObjectMapper();
		//String JSON = mapper.writeValueAsString(book);
		String JSON = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(book);
		System.out.println(JSON);

	}

}
