package com.david.learn.funcprogramming.demo.jdk8.section10;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningDemo {

    public static void main(String[] args) {
        String join1=Stream.of("C","H","O","W").collect(Collectors.joining());
        System.out.println(join1);
        String join2 = Stream.of("C","H","O","W").collect(Collectors.joining(","));
        System.out.println(join2);
        String join3 = Stream.of("C","H","O","W").collect(Collectors.joining(",","[","]"));
        System.out.println(join3);
        String allTags = BookService.getAll().stream()
                .map(Book::getTags).flatMap(List::stream)
                .collect(Collectors.joining(","));
        System.out.println(allTags);


    }
}
