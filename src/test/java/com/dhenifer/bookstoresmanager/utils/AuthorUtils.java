package com.dhenifer.bookstoresmanager.utils;

import com.dhenifer.bookstoresmanager.dto.AuthorDTO;
import com.dhenifer.bookstoresmanager.dto.BookDTO;
import com.github.javafaker.Faker;

public class AuthorUtils {

    private static final Faker faker = Faker.instance();

   public static AuthorDTO createFakeAuthorDTO() {
       return AuthorDTO.builder()
               .id(faker.number().randomNumber())
               .name(faker.book().author())
               .age(faker.number().numberBetween(0,100))
               .build();
   }
}
