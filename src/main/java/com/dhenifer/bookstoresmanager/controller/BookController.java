package com.dhenifer.bookstoresmanager.controller;


import com.dhenifer.bookstoresmanager.dto.BookDTO;
import com.dhenifer.bookstoresmanager.dto.MessageResponseDTO;
import com.dhenifer.bookstoresmanager.entity.Book;
import com.dhenifer.bookstoresmanager.repository.BookRepository;
import com.dhenifer.bookstoresmanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO){
        return bookService.create(bookDTO);
    }
}
