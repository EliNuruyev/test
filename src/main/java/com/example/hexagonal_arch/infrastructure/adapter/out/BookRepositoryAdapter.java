package com.example.hexagonal_arch.infrastructure.adapter.out;

import com.example.hexagonal_arch.application.port.out.BookRepositoryPort;
import com.example.hexagonal_arch.domain.Book;
import com.example.hexagonal_arch.infrastructure.adapter.out.entity.BookEntity;
import com.example.hexagonal_arch.infrastructure.repository.SpringDataBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookRepositoryAdapter implements BookRepositoryPort {

    private final SpringDataBookRepository springDataBookRepository;

    @Override
    public void saveBook(Book book) {

        springDataBookRepository.save(
                BookEntity.builder()
                        .author(book.getAuthor())
                        .title(book.getTitle())
                        .build()
        );
    }
}
