package ro.uvt;

<<<<<<< HEAD
=======

>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.example.ClientComponent;
import ro.uvt.example.SingletonComponent;
import ro.uvt.example.TransientComponent;
<<<<<<< HEAD
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import ro.uvt.example.controllers.BookController;
import ro.uvt.models.*;
import ro.uvt.services.*;
=======
import ro.uvt.models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a

@SpringBootApplication
public class SpLabApplication {

    public static void main(String[] args) throws Exception {
        //SpringApplication.run(SpLabApplication.class, args);
<<<<<<< HEAD
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

        String filePath = "books.txt";

        Command bookSaveCommand = new SaveBookCommand(noapteBuna, filePath);
        Invoker invoker = new Invoker();
        invoker.setCommand(bookSaveCommand);

        invoker.executeCommand();



=======
//        Section cap1 = new Section("Capitolul 1");
//        Paragraph p1 = new Paragraph("Paragraph 1");
//        cap1.add(p1);
//        Paragraph p2 = new Paragraph("Paragraph 2");
//        cap1.add(p2);
//        Paragraph p3 = new Paragraph("Paragraph 3");
//        cap1.add(p3);
//        Paragraph p4 = new Paragraph("Paragraph 4");
//        cap1.add(p4);
//        System.out.println("Printing without Alignment");
//        System.out.println();
//        cap1.print();
//        p1.setAlignStrategy(new AlignCenter());
//        p2.setAlignStrategy(new AlignRight());
//        p3.setAlignStrategy(new AlignLeft());
//
//        System.out.println();
//        System.out.println("Printing with Alignment");
//        System.out.println();
//        cap1.print();

        //
// Run this main function and inspect the output console
// to learn about
// the lifecycle of objects within
// Spring Dependency Injection Context
//
// Gets a handle of dependency injection context
        ApplicationContext context =
                SpringApplication.run(SpLabApplication.class, args);
// Gets an instance of TransientComponent from the DI context
        TransientComponent transientBean =
                context.getBean(TransientComponent.class);
        transientBean.operation();
// Note that every time an instance is required,
// the DI context creates a new one
        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();
// Gets an instance of SingletonComponent from the DI context
// Note that the unique instance was created while
// application was loaded, before creating
// the transient instances
        SingletonComponent singletonBean =
                context.getBean(SingletonComponent.class);
        singletonBean.operation();
// Note that every time an instance is required,
// the DI returns the same unique one
        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();
// Gets an instance of another class that
// requires singleton/transient components
// Note where this instance was created and what beans
// were used to initialize it
        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();
// One can also request an instance from DI context by name
        c = (ClientComponent)context.getBean("clientComponent");
        c.operation();
>>>>>>> aae49cabfa902e27e6797e66aa6f4d2f6e6d405a
    }

}