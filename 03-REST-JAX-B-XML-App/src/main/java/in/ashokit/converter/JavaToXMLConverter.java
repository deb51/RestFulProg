package in.ashokit.converter;

import java.io.File;
import java.io.FileWriter;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException; 

import com.sun.xml.internal.ws.util.Pool.Marshaller;

import in.ashokit.Beans.Address;
import in.ashokit.Beans.Person;

public class JavaToXMLConverter
{
    public static void main( String[] args ) throws Exception
    {
       Address add=new Address("MBJ", (long) 757041);
       Person per=new Person("debasish", 20, add);
       
       JAXBContext context=JAXBContext.newInstance(Person.class);
       javax.xml.bind.Marshaller marshaller = context.createMarshaller();
       marshaller.marshal(per, new File("person.xml"));
      
    }
}
