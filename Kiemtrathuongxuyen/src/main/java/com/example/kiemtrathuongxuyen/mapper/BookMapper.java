package com.example.kiemtrathuongxuyen.mapper;

import com.example.kiemtrathuongxuyen.dto.request.CreateBookDTO;
import com.example.kiemtrathuongxuyen.dto.response.BookResponseDTO;
import com.example.kiemtrathuongxuyen.entity.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toBook(CreateBookDTO createBookDTO);
    BookResponseDTO toBookResponseDTO(Book book);
    List<BookResponseDTO> toBookResponseDTOList(List<Book> bookList);
}
