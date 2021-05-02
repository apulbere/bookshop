package com.apulbere.bookshop.controller;

import com.apulbere.bookshop.api.BooksApi;
import com.apulbere.bookshop.api.domain.Book;
import com.apulbere.bookshop.domain.BookSearchCriteria;
import com.apulbere.bookshop.domain.DomainMapper;
import com.apulbere.bookshop.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@AllArgsConstructor
public class BooksController implements BooksApi {

    private final BookService bookService;
    private final DomainMapper domainMapper;

    @Override
    public ResponseEntity<List<Book>> listBooks(String title) {
        var books = bookService.findAll(new BookSearchCriteria(title)).stream()
                .map(domainMapper::map)
                .collect(toList());

        return ResponseEntity.ok(books);
    }
}
