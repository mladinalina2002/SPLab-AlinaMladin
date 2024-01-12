package ro.uvt.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import ro.uvt.services.Visitor;

import java.util.concurrent.TimeUnit;

@Data
@Entity
public class Image extends BaseElement implements Picture{
    @Id
    private int id;
    private String imageName;

    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Image() {

    }

    public void print() {
        System.out.println("Image with name: " + imageName);
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
        v.visitImage(this);
    }

    @Override
    public String url() {
        return null;
    }

}