package com.apulbere.bookshop;

import com.apulbere.bookshop.domain.Book;
import com.apulbere.bookshop.repository.BookRepository;
import com.apulbere.bookshop.repository.InMemBooksRepository;
import com.apulbere.bookshop.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.UUID;

import static java.util.Collections.singletonList;

@Configuration
public class LibraryTestConfig {

    @Bean
    public BookRepository bookRepository() {
        Book b1 = new Book(UUID.randomUUID(), "The Gambler", singletonList("F. Dostoevsky"));

        return new InMemBooksRepository(List.of(b1));
    }

    @Bean
    public BookService bookService(BookRepository bookRepository) {
        return new BookService(bookRepository);
    }
}
