package test.jaxb.demo.pet;

import javax.xml.bind.annotation.XmlElement;

public class Dog  {
    private String dogType;

    public Dog() {
    }

    public Dog(String dogType) {
        this.dogType = dogType;
    }

    public String getDogType() {
        return dogType;
    }

    @XmlElement
    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogType='" + dogType + '\'' +
                '}';
    }
}
