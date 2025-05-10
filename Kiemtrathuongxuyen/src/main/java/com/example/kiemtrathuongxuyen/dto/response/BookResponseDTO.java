package com.example.kiemtrathuongxuyen.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class BookResponseDTO {
    private long id;
    private String name;
    private String description;
    private Double price;
    private String authorId;
    private String categoryId;
}
