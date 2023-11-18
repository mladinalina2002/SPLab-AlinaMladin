package ro.uvt.models;
import lombok.Data;

import java.util.concurrent.TimeUnit;

@Data
public class Image implements Element, Picture{
    private String imageName;


    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
    public String url() {
        return null;
    }
}