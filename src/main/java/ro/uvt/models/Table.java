package ro.uvt.models;

import lombok.Data;
import ro.uvt.services.Visitor;

@Data
public class Table implements Element{
    private String something;

    public Table(String something) {
        this.something = something;
    }

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
        v.visitTable(this);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
