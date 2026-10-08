package com.library.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.management.entity.Book;
import com.library.management.service.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }
    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return "Book deleted successfully";
    }
}
