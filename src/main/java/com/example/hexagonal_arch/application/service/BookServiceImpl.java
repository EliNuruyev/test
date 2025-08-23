package com.example.hexagonal_arch.application.service;

import com.example.hexagonal_arch.application.port.in.BookServicePort;
import com.example.hexagonal_arch.application.port.out.BookRepositoryPort;
import com.example.hexagonal_arch.domain.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookServicePort {

    private final BookRepositoryPort  bookRepositoryPort;

    @Override
    public void createBook(Book book) {
        bookRepositoryPort.saveBook(book);
    }
}
