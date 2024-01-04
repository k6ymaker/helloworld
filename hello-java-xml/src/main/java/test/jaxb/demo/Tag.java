package test.jaxb.demo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

public class Tag {
    private String content;

    public Tag() {
    }

    public Tag(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @XmlValue
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "content='" + content + '\'' +
                '}';
    }
}
