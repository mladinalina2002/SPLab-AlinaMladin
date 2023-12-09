package ro.uvt;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.example.ClientComponent;
import ro.uvt.example.SingletonComponent;
import ro.uvt.example.TransientComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import ro.uvt.example.controllers.BookController;
import ro.uvt.models.*;
import ro.uvt.services.*;

@SpringBootApplication
public class SpLabApplication {

    public static void main(String[] args) throws Exception {
        //SpringApplication.run(SpLabApplication.class, args);
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel", " Gheo");
        noapteBuna.addAuthor(rpGheo);
        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
        noapteBuna.addContent(cap1);
        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        cap11.add(cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));
        //noapteBuna.accept(new RenderContentVisitor());
        new RenderContentVisitor().visitBook(noapteBuna);
        System.out.println(new BookController().printStatistics());



    }

}