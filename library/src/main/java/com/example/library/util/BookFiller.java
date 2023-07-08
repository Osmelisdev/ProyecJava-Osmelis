package com.example.library.util;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

import jakarta.annotation.PostConstruct;

@Component
public class BookFiller {
    private final BookService bookService;
    
    public BookFiller(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct 
    public void init()
    {
        Book book1 = new Book("Avatar", "Primer libro", "Tolkien");
        bookService.addBook(book1);
        int millis;
        try {Thread.sleep(millis= 1000);} catch (InterruptedException e) {}

        Book book2 = new Book("Los tres cerditos", "Segundo libro", "J.R");
        bookService.addBook(book2);
                try {Thread.sleep(millis= 1000);} catch (InterruptedException e) {}

        Book book3 = new Book("Caperucita roja", "Tercer libro", "Javier J.");
        bookService.addBook(book3);
    
    }
}