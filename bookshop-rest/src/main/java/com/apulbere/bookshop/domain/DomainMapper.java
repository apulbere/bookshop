package com.apulbere.bookshop.domain;

import org.springframework.stereotype.Component;

@Component
public class DomainMapper {

    public com.apulbere.bookshop.api.domain.Book map(com.apulbere.bookshop.domain.Book book) {
        return new com.apulbere.bookshop.api.domain.Book()
                .id(book.id())
                .title(book.title())
                .authors(book.authors());
    }
}
