package ro.uvt.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import ro.uvt.services.Visitor;


@Data
@Entity
public class TableOfContents implements Element{
    @Id
    private int id;
    private String something;

    @Override
    public void print() {
        System.out.println("Something: " + something);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int id) {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitTableOfContents(this);
    }
}