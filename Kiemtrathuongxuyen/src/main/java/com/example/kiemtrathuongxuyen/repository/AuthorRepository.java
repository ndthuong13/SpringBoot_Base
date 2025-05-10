package com.example.kiemtrathuongxuyen.repository;

import com.example.kiemtrathuongxuyen.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends JpaRepository<Author, String> {
}
