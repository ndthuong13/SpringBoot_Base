package com.example.kiemtrathuongxuyen.service.Imp;

import com.example.kiemtrathuongxuyen.dto.request.CreateBookDTO;
import com.example.kiemtrathuongxuyen.dto.response.BookResponseDTO;
import com.example.kiemtrathuongxuyen.entity.Book;
import com.example.kiemtrathuongxuyen.mapper.BookMapper;
import com.example.kiemtrathuongxuyen.repository.BookRepository;
import com.example.kiemtrathuongxuyen.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImplement implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;


    @Override
    public List<BookResponseDTO> getAllBooks() {
        return bookMapper.toBookResponseDTOList(bookRepository.findAll());
    }

    @Override
    public BookResponseDTO getBookById(String id) {
        return null;
    }

    @Override
    public BookResponseDTO createBook(CreateBookDTO createBookDTO) {
        return null;
    }

    @Override
    public BookResponseDTO updateBook(Book book) {
        return null;
    }
}
