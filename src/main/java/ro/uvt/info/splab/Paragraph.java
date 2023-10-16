package ro.uvt.info.splab;
import lombok.Data;

@Data
public class Paragraph extends Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Text: " + text);
    }
}
