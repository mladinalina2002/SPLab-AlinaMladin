package ro.uvt.models;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.io.Serializable;
import java.util.ArrayList;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Book extends Section implements Serializable {
=======
import lombok.Data;

import java.util.ArrayList;


public class Book extends Section{
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
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