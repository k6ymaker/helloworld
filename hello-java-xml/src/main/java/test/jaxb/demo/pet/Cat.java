package test.jaxb.demo.pet;

import javax.xml.bind.annotation.XmlElement;

public class Cat {
    private String catType;

    public Cat() {
    }

    public Cat(String catType) {
        this.catType = catType;
    }

    public String getCatType() {
        return catType;
    }

    @XmlElement
    public void setCatType(String catType) {
        this.catType = catType;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catType='" + catType + '\'' +
                '}';
    }
}
