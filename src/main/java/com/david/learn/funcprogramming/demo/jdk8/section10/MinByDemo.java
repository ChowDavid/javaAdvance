package com.david.learn.funcprogramming.demo.jdk8.section10;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookService;

import static java.util.Comparator.*;
import java.util.Optional;
import static java.util.stream.Collectors.*;


public class MinByDemo {
    public static void main(String[] args) {
        Optional<Book> minPage = BookService.getAll().stream()
                .collect(minBy(comparing(Book::getPage)));
        System.out.println("minPage = " + minPage);
        minPage = BookService.getAll().stream()
                .min(comparing(Book::getPage));
        System.out.println("minPage = " + minPage);

        Optional<Book> maxPage = BookService.getAll().stream()
                .collect(maxBy(comparing(Book::getPage)));
        System.out.println("maxPage = " + maxPage);
        maxPage = BookService.getAll().stream()
                .max(comparing(Book::getPage));
        System.out.println("maxPage = " + maxPage);

    }

}
