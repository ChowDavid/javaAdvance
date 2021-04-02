package com.david.learn.funcprogramming.demo.jdk8.section3;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookService;

import java.util.List;
import java.util.function.BiPredicate;

/**
 * Predicate with two input and one boolean output
 */
public class BiPredicateDemo {

    public static void main(String[] args) {
        List<Book> books = BookService.getAll();
        BiPredicate<Boolean,Integer> p3 = (x,y)-> x && y>200;

        books.forEach((b)-> {
            if (p3.test(b.isEBook(), b.getPage())){
                System.out.println(b);
            }
        });

    }
}
