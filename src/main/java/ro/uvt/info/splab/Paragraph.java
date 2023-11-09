package ro.uvt.info.splab;
import lombok.Data;



@Data
public class Paragraph implements Element{
    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text) {
        this.text = text;
    }

    public Paragraph(AlignStrategy textAlignment) {
        this.textAlignment = textAlignment;
    }

    public void render(Paragraph paragraph, Context context){
        textAlignment.render(paragraph, context);
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.textAlignment = alignStrategy;
    }

    public void print() {
        System.out.println("Text: " + text);
        if (textAlignment != null) {
            textAlignment.render(this, new Context());
        } else {
            System.out.println(text);
        }
    }


    public void add() {
        add(null);
    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int id) {
        return null;
    }

}