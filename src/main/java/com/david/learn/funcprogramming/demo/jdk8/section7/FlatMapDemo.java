package com.david.learn.funcprogramming.demo.jdk8.section7;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookService;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<String> allTags = BookService.getAll().stream().map(Book::getTags).flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(allTags);

    }
}
