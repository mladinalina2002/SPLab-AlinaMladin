package ro.uvt.models;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.io.Serializable;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Author implements Serializable {
=======
public class Author {
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname=surname;
    }

    public void print() {

        System.out.println("Name: " + name + ", surname: " + surname);
    }
}