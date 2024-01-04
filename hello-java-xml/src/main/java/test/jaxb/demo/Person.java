package test.jaxb.demo;


import test.jaxb.demo.pet.Cat;
import test.jaxb.demo.pet.Dog;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Person {
    /**
     * 如果注解在filed上，同时有set方法，会报错，重复的解析
     */
    @XmlElement
    private String Sex;
    private int id;
    private String name;
    private Address address;

    public Tag getTag() {
        return tag;
    }

    @XmlElement(name="tag")
    public void setTag(Tag tag) {
        this.tag = tag;
    }

    private Tag tag;

    public Person(String sex, int id, String name, Address address, Tag tag, List pets) {
        Sex = sex;
        this.id = id;
        this.name = name;
        this.address = address;
        this.tag = tag;
        this.pets = pets;
    }

    public Person(String sex, int id, String name, Address address, List pets) {
        Sex = sex;
        this.id = id;
        this.name = name;
        this.address = address;
        this.pets = pets;
    }

    @XmlElements({
            @XmlElement(name="Dog",type= Dog.class),
            @XmlElement(name="Cat",type= Cat.class)
    })
    private List pets;


    public Person(int id, String name, Address address, List pets) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.pets = pets;
    }

    public Address getAddress() {
        return address;
    }

    @XmlElement(name="Address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person(){

    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Sex='" + Sex + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", tag=" + tag +
                ", pets=" + pets +
                '}';
    }
}
