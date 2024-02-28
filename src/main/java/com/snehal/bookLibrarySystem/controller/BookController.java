package com.snehal.bookLibrarySystem.controller;

import com.snehal.bookLibrarySystem.entity.Book;
import com.snehal.bookLibrarySystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BookController {
    @Autowired
    public BookService bookService;

    @PostMapping("/addBook")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Book> addBook(@RequestBody Book book){
       return bookService.addBook(book);
    }
}
