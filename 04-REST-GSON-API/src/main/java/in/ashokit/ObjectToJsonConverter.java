package in.ashokit;

import com.google.gson.Gson;



public class ObjectToJsonConverter {
	public static void main(String[] args) {

		Address add=new Address("MBJ", (long) 757041);
	       Person per=new Person("debasish", 20, add);
	       
	       Gson gson=new Gson();
	       System.out.println("GSON");
	       String json = gson.toJson(per);
	       System.out.println(json);
	}
}
