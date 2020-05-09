package com.youcode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youcode.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
