package ro.uvt.models;

import lombok.Data;

import java.util.ArrayList;


public class Book extends Section{
    private ArrayList<Author> authors=new ArrayList<>();
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