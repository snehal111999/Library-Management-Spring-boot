package com.snehal.bookLibrarySystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    private String BookName;

    private String Author;

    private LocalDate Date;

    private Integer price;

    private Integer copies;

}
