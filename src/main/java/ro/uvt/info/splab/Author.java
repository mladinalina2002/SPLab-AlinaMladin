package ro.uvt.info.splab;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Name: " + name);
    }
}