package ro.uvt.command;

import ro.uvt.models.Book;
import ro.uvt.persistence.BooksRepository;

public class CreateBookCommand {

    private final BooksRepository booksRepository;

    public CreateBookCommand(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public Book execute() {
        Book book = new Book();
        // Set properties on book

        // Save the book using the repository
        return booksRepository.save(book);
    }
}