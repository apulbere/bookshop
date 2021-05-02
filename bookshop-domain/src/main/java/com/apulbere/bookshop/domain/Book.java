package com.apulbere.bookshop.domain;

import java.util.List;
import java.util.UUID;

public record Book(UUID id, String title, List<String> authors) {
}
