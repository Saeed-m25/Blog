package com.example.blog.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "title can't be Empty")
    @Column(columnDefinition = "varchar (4) not null")
    private String title;
    @NotEmpty(message = "category can't be Empty")
    @Column(columnDefinition = "varchar (4) not null")   //سلسلة الاختيار مطلوبه
    private String category;
    @NotEmpty
    @Column(columnDefinition = "text not null")
    @Size
    @Max(300)
    private String body;
    @Column(columnDefinition = "beoolean default false")
    private boolean isPublished;



}
