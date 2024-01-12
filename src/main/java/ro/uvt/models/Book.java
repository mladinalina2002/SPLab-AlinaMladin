package ro.uvt.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Book extends Section implements Serializable {
    @Id
    private int id;

    @ManyToMany
    private ArrayList<Author> authors=new ArrayList<>();
    public Book(String title) {
        super(title);
    }

    public Book() {

    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public void addContent(Element element){
        super.add(element);
    }

}