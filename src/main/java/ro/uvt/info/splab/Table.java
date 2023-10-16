package ro.uvt.info.splab;
import lombok.Data;

@Data
public class Table extends Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Title: " + title);
    }
}
