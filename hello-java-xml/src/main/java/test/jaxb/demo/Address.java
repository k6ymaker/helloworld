package test.jaxb.demo;

import javax.xml.bind.annotation.XmlElement;

public class Address {

    private int id;
    private String name;

    public Address(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Address() {
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

    public String toString(){
        return "Address{"+
                    "id="+this.id+
                    ",name="+this.name+
                "}";
    }
}
