package ro.uvt.info.splab;
import lombok.Data;

@Data
public class Table implements Element{
    private String something;

    public Table(String something) {
        this.something = something;
    }

    public void print() {
        System.out.println("Something: " + something);
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