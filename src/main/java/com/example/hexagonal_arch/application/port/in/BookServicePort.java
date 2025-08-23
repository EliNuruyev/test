package com.example.hexagonal_arch.application.port.in;

import com.example.hexagonal_arch.domain.Book;

public interface BookServicePort {
    void createBook(Book book);
}
