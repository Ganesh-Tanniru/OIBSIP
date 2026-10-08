package com.library.management.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Service;

import com.library.management.entity.Book;
import com.library.management.entity.Issue;
import com.library.management.repository.BookRepository;
import com.library.management.repository.IssueRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class IssueService {

    private final IssueRepository issueRepository;
    private final BookRepository bookRepository;

    public Issue issueBook(Issue issue) {

        Book book = bookRepository.findById(issue.getBookId()).orElse(null);

        if (book != null && book.getAvailableQuantity() > 0) {

            book.setAvailableQuantity(book.getAvailableQuantity() - 1);

            bookRepository.save(book);

            return issueRepository.save(issue);

        } else {

            return null;
        }
    }

    public Issue returnBook(Long issueId) {

        Issue issue = issueRepository.findById(issueId).orElse(null);

        if (issue != null) {

            issue.setReturnDate(LocalDate.now().toString());

            Book book = bookRepository.findById(issue.getBookId()).orElse(null);

            if (book != null) {
                book.setAvailableQuantity(book.getAvailableQuantity() + 1);
                bookRepository.save(book);
            }

            return issueRepository.save(issue);

        } else {

            return null;
        }
    }

    public double calculateFine(Long issueId) {

        Issue issue = issueRepository.findById(issueId).orElse(null);

        if (issue != null) {

            LocalDate dueDate = LocalDate.parse(issue.getDueDate());
            LocalDate returnDate = LocalDate.parse(issue.getReturnDate());

            long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);

            if (lateDays > 0) {
                double fine = lateDays * 5;
                issue.setFine(fine);
                issueRepository.save(issue);
                return fine;
            }
        }

        return 0;
    }
}