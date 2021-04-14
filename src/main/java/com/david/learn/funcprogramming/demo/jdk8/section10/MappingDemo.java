package com.david.learn.funcprogramming.demo.jdk8.section10;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookService;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class MappingDemo {
    public static void main(String[] args) {
        //creat a name list
        BookService.getAll().stream().collect(mapping(Book::getName,toList()));
        BookService.getAll().stream().map(Book::getName).collect(toList());
        Map<Boolean, List<String>> bookMap = BookService.getAll().stream().collect(groupingBy(Book::isEBook,mapping(Book::getName,toList())));
        System.out.println(bookMap);
    }
}
