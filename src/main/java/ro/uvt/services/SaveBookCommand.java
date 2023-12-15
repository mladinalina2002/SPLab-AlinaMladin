package ro.uvt.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import ro.uvt.models.Book;

import java.io.*;

public class SaveBookCommand implements Command{
    private Book book;
    private String path;

    public SaveBookCommand(Book book, String path) {
        this.book = book;
        this.path = path;
    }

    @Override
    public void execute() {
        try {
            // Use Jackson ObjectMapper to convert the book object to JSON
            ObjectMapper objectMapper = new ObjectMapper();
            String bookJson = objectMapper.writeValueAsString(book);

            // Write the JSON string to the file
            try (PrintWriter writer = new PrintWriter(new FileWriter(path))) {
                writer.println(bookJson);
                System.out.println("Book has been written to the file: " + path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
