package ro.uvt.models;

import ro.uvt.services.Visitor;

public class TableOfContents implements Element{
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
<<<<<<< HEAD
}
=======
}
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
