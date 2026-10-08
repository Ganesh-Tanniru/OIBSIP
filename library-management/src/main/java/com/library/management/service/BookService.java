package com.library.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.management.entity.Book;
import com.library.management.repository.BookRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService {
	private final BookRepository bookRepository;
	public Book addBook(Book book) {
	    return bookRepository.save(book);
	}
	public List<Book> getAllBooks() {
	    return bookRepository.findAll();
	}
	public Book updateBook(Long id, Book book) {
	    Book existingBook = bookRepository.findById(id).orElse(null);

	    if (existingBook != null) {
	        existingBook.setTitle(book.getTitle());
	        existingBook.setAuthor(book.getAuthor());
	        existingBook.setIsbn(book.getIsbn());
	        existingBook.setCategory(book.getCategory());
	        existingBook.setQuantity(book.getQuantity());
	        existingBook.setAvailableQuantity(book.getAvailableQuantity());

	        return bookRepository.save(existingBook);
	    }

	    return null;
	}
	public void deleteBook(Long id) {
	    bookRepository.deleteById(id);
	}
}
