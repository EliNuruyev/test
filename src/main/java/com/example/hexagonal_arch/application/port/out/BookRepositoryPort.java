package com.example.hexagonal_arch.application.port.out;

import com.example.hexagonal_arch.domain.Book;

public interface BookRepositoryPort {
    void saveBook(Book book);
}
