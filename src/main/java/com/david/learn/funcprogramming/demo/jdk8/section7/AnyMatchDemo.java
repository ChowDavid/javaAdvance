package com.david.learn.funcprogramming.demo.jdk8.section7;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookService;

import java.util.List;


/**
 * anyMatch
 * allMatch
 * noneMatch
 */
public class AnyMatchDemo {
    public static void main(String[] args) {
        boolean match = BookService.getAll().stream().map(Book::getTags).flatMap(List::stream).noneMatch(t->t.equalsIgnoreCase("Peter"));
        System.out.println(match);



    }
}
