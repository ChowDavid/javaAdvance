package com.david.learn.funcprogramming.demo.jdk8.section10;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookService;

import java.util.List;
import java.util.stream.Collectors;

public class CountingDemo {
    public static void main(String[] args) {
        System.out.println(BookService.getAll().stream().count());
        System.out.println(BookService.getAll().stream().map(Book::getTags).flatMap(List::stream).collect(Collectors.counting()));
    }
}
