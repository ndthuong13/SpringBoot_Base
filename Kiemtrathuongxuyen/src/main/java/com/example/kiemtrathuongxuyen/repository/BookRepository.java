package com.example.kiemtrathuongxuyen.repository;

import com.example.kiemtrathuongxuyen.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
