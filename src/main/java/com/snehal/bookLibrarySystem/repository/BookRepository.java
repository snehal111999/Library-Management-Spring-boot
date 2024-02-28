package com.snehal.bookLibrarySystem.repository;

import com.snehal.bookLibrarySystem.entity.Book;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends R2dbcRepository <Book,String> {
}
