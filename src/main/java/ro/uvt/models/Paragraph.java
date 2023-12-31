package ro.uvt.models;

import lombok.Data;
import ro.uvt.services.AlignStrategy;
import ro.uvt.services.Visitor;


@Data
public class Paragraph implements Element{
    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text, AlignStrategy textAlignment) {
        this.text = text;
        this.textAlignment=textAlignment;
    }

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
        v.visitParagraph(this);
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
