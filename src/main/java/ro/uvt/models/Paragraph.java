package ro.uvt.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;
import ro.uvt.services.AlignStrategy;
import ro.uvt.services.Visitor;


@Data
@Entity
public class Paragraph extends BaseElement{
    @Id
    private int id;
    private String text;
    @Transient
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

    public Paragraph() {

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

}