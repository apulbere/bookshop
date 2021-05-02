package com.apulbere.bookshop.repository;

import com.apulbere.bookshop.domain.Book;

import java.util.List;

public interface BookRepository {

    List<Book> findAll();
}
