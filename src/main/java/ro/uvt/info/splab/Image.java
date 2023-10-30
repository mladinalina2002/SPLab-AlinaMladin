package ro.uvt.info.splab;
import lombok.Data;

@Data
public class Image implements Element{
    private String url;

    public Image(String url) {
        this.url = url;
    }

    public void print() {
        System.out.println("Image with url: " + url);
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
}
