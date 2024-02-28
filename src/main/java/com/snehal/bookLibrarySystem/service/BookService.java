package com.snehal.bookLibrarySystem.service;

import com.snehal.bookLibrarySystem.entity.Book;
import com.snehal.bookLibrarySystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Mono;
@Service
public class BookService {
    @Autowired
    public BookRepository bookRepository;

    public Mono<Book> addBook( Book book) {
        return bookRepository.save(book);
    }
}
