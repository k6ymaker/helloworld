package test.jaxb;
import org.junit.Test;
import test.jaxb.demo.Address;
import test.jaxb.demo.Person;
import test.jaxb.demo.Tag;
import test.jaxb.demo.pet.Cat;
import test.jaxb.demo.pet.Dog;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class JAXBTest {

    @Test
    public void generateXML() throws Exception{

        List l = new ArrayList();
        l.add(new Dog("jinmao"));
        l.add(new Cat("meiduan"));

        Person p = new Person("male",1,"wang",new Address(2,"xx小区"),new Tag("student"),l);
        File file = new File("./test.xml");
        JAXBContext jc = null;

        try{
            jc = JAXBContext.newInstance(Person.class);

            Marshaller ma = jc.createMarshaller();
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            ma.setProperty(Marshaller.JAXB_ENCODING,"UTF-8");
            ma.setProperty(Marshaller.JAXB_FRAGMENT,false);
            ma.marshal(p,file);
        } catch (JAXBException jaxbException){
            jaxbException.printStackTrace();
        }
    }


    @Test
    public void generateBean(){
        File file = new File("./test.xml");
        JAXBContext jc = null;

        try{
            jc = JAXBContext.newInstance(Person.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            Person p = (Person) unmarshaller.unmarshal(file);
            System.out.println(p);
        }catch (JAXBException jaxbException){
            jaxbException.printStackTrace();
        }
    }
}
