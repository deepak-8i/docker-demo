package com.example.demo.repository;

import com.example.demo.data.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// Spring Data magic :)
public interface BookRepository extends JpaRepository<Book, Long> {
}