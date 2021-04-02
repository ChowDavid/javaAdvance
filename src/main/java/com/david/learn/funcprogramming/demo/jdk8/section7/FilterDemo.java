package com.david.learn.funcprogramming.demo.jdk8.section7;

import com.david.learn.funcprogramming.service.BookService;

public class FilterDemo {
    public static void main(String[] args) {
        BookService.getAll().stream()
               .filter(c->c.getName().startsWith("Java"))
                .forEach(System.out::println);
    }
}
