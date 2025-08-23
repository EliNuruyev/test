package com.example.hexagonal_arch.infrastructure.adapter.in;

import com.example.hexagonal_arch.application.port.in.BookServicePort;
import com.example.hexagonal_arch.domain.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookServicePort bookServicePort;

    @PostMapping("/create")
    public void createBook(@RequestBody Book book) {
        bookServicePort.createBook(book);
    }
}
