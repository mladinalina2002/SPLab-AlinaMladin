package ro.uvt.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.io.Serializable;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Author implements Serializable {
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