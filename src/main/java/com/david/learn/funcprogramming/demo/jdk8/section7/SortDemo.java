package com.david.learn.funcprogramming.demo.jdk8.section7;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookService;

import java.util.List;
import java.util.stream.Collectors;

public class SortDemo {
    public static void main(String[] args) {
        List<String> tags = BookService.getAll().stream().map(Book::getTags).flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
        System.out.println(tags);



    }
}
