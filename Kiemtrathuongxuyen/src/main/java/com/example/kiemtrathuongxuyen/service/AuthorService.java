package com.example.kiemtrathuongxuyen.service;

import com.example.kiemtrathuongxuyen.dto.request.CreatAuthorDTO;
import com.example.kiemtrathuongxuyen.dto.response.AuthorResponseDTO;
import com.example.kiemtrathuongxuyen.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAuthors();
    AuthorResponseDTO getAuthorById(String id);
    AuthorResponseDTO createAuthor(CreatAuthorDTO creatAuthorDTO);

    AuthorResponseDTO updateAuthor(Author author);
}
