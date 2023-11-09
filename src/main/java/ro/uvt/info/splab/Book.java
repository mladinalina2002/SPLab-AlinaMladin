package ro.uvt.info.splab;
import lombok.Data;

import java.util.ArrayList;


public class Book extends Section{
    private final ArrayList<Author> authors=new ArrayList<>();
    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void addContent(Element element){
        super.add(element);
    }

}