package com.dhenifer.bookstoresmanager.service;

import com.dhenifer.bookstoresmanager.dto.BookDTO;
import com.dhenifer.bookstoresmanager.dto.MessageResponseDTO;
import com.dhenifer.bookstoresmanager.entity.Book;
import com.dhenifer.bookstoresmanager.exception.BookNotFoundException;
import com.dhenifer.bookstoresmanager.mapper.BookMapper;
import com.dhenifer.bookstoresmanager.repository.BookRepository;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO){
        Book bookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                //.build()
                ;
    }

    public BookDTO findById(Long id) throws BookNotFoundException {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));

        return bookMapper.toDTO(book);
    }

}
