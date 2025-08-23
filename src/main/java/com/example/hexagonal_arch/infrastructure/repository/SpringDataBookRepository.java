package com.example.hexagonal_arch.infrastructure.repository;

import com.example.hexagonal_arch.infrastructure.adapter.out.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataBookRepository extends JpaRepository<BookEntity, Long> {
}
