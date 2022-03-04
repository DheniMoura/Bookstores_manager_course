package com.dhenifer.bookstoresmanager.mapper;

import com.dhenifer.bookstoresmanager.dto.BookDTO;
import com.dhenifer.bookstoresmanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
