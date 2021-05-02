package com.apulbere.bookshop.service;

import com.apulbere.bookshop.domain.Book;
import com.apulbere.bookshop.domain.BookSearchCriteria;
import com.apulbere.bookshop.repository.BookRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> findAll(BookSearchCriteria criteria) {
        return bookRepository.findAll()
                .stream()
                .filter(matches(criteria))
                .collect(toList());
    }

    private Predicate<Book> matches(BookSearchCriteria criteria) {
        return book -> book.title()
                .toLowerCase()
                .contains(criteria.title().toLowerCase());
    }
}
