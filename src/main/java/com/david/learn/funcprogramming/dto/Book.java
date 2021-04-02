package com.david.learn.funcprogramming.dto;


import lombok.*;

import java.util.List;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Book {
    private String name;
    private int page;
    private boolean eBook;
    private List<String> tags;


}
