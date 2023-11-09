package ro.uvt.info.splab;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname=surname;
    }

    public void print() {

        System.out.println("Name: " + name + ", surname: " + surname);
    }
}