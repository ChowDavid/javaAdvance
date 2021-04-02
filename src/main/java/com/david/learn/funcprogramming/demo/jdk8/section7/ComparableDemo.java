package com.david.learn.funcprogramming.demo.jdk8.section7;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookService;

import java.util.Comparator;
import java.util.stream.Collectors;

public class ComparableDemo {
    public static void main(String[] args) {
        BookService.getAll().stream()
                .sorted(Comparator.comparing(Book::getName).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
