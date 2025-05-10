package com.example.kiemtrathuongxuyen.dto.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateBookDTO {

    @NotNull
    private String name;

    private String description;

    private Double price;

    private Long Author_id;

    private String Bio;

}
