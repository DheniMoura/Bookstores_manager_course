package com.dhenifer.bookstoresmanager.repository;

import com.dhenifer.bookstoresmanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
