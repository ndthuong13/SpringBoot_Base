package com.example.kiemtrathuongxuyen.service.Imp;

import com.example.kiemtrathuongxuyen.dto.request.CreatAuthorDTO;
import com.example.kiemtrathuongxuyen.dto.response.AuthorResponseDTO;
import com.example.kiemtrathuongxuyen.entity.Author;
import com.example.kiemtrathuongxuyen.repository.AuthorRepository;
import com.example.kiemtrathuongxuyen.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImplement implements AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Override
    public List<Author> getAuthors() {
        return List.of();
    }

    @Override
    public AuthorResponseDTO getAuthorById(String id) {
        return null;
    }

    @Override
    public AuthorResponseDTO createAuthor(CreatAuthorDTO creatAuthorDTO) {
        return null;
    }

    @Override
    public AuthorResponseDTO updateAuthor(Author author) {
        return null;
    }
}
