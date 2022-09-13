package com.cydoe.model;


import lombok.Data;

@Data // to use @Getter and @Setter
public class Comment {
    private String author;
    private String text;

}

// Never put @component in model Class, it doesn't have A has a relationship