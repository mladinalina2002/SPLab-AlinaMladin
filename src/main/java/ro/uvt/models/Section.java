package ro.uvt.models;

import ro.uvt.services.Visitor;

import java.util.ArrayList;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import ro.uvt.services.Visitor;
import java.util.ArrayList;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
=======
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
public class Section implements Element{
    private String title;
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
<<<<<<< HEAD
}
=======
}
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
