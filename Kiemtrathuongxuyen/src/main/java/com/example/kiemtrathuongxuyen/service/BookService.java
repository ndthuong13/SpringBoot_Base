package com.example.kiemtrathuongxuyen.service;

import com.example.kiemtrathuongxuyen.dto.request.CreateBookDTO;
import com.example.kiemtrathuongxuyen.dto.response.BookResponseDTO;
import com.example.kiemtrathuongxuyen.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    BookResponseDTO getBookById(String id);
    BookResponseDTO createBook(CreateBookDTO createBookDTO);
    BookResponseDTO updateBook(Book book);
}
