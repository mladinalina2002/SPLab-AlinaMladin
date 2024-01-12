package ro.uvt.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.*;
import lombok.Data;
import ro.uvt.services.Visitor;
import java.util.ArrayList;

@Data
@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Section extends BaseElement{
    @Id
    private int id;
    private String title;
    @OneToMany(targetEntity = BaseElement.class)
    private ArrayList<Element> elements=new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (Element element : elements) {
            element.print();
        }
    }

    public Section() {
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(int id) {
        return elements.get(id);
    }

    @Override
    public void accept(Visitor v) {
        v.visitSection(this);
    }
}