package com.example.kiemtrathuongxuyen.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "author")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.UUIDGenerator")
    @Column(insertable = false, updatable = false, nullable = false, columnDefinition = "CHAR(36)")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String Dob;


    private String Bio;

}
