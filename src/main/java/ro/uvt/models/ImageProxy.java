package ro.uvt.models;

import ro.uvt.services.Visitor;

public class ImageProxy implements Element, Picture{
    String url;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage=null;
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
<<<<<<< HEAD
}
=======
}
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
