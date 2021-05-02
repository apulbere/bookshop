package com.apulbere.bookshop.repository;

import com.apulbere.bookshop.domain.Book;

import java.util.List;

public class InMemBooksRepository implements BookRepository {

    private final List<Book> books;

    public InMemBooksRepository(List<Book> books) {
        this.books = List.copyOf(books);
    }

    @Override
    public List<Book> findAll() {
        return books;
    }
}
