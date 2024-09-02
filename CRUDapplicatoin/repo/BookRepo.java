package com.example.CRUDapplicatoin.repo;

import com.example.CRUDapplicatoin.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
