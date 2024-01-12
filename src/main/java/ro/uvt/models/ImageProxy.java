package ro.uvt.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;
import ro.uvt.services.Visitor;

@Data
@Entity
public class ImageProxy extends BaseElement implements  Picture{
    @Id
    private int id;
    private String url;
    @Transient
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage=null;
    }

    public ImageProxy() {

    }

    @Override
    public void print() {
        loadImage();
        realImage.print();
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
        v.visitImageProxy(this);
    }

    @Override
    public String url() {
        return null;
    }

    Image loadImage(){
        if(realImage == null){
            realImage=new Image(url);
        }
        return realImage;
    }
}