package com.david.learn.funcprogramming.demo.jdk8.section7;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookService;

import java.util.List;

public class CountDemo {
    public static void main(String[] args) {
        long count = BookService.getAll().stream().map(Book::getTags).flatMap(List::stream).distinct().count();
        System.out.println(count);



    }
}
