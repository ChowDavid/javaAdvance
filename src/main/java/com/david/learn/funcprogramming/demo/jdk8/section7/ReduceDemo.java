package com.david.learn.funcprogramming.demo.jdk8.section7;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        System.out.println(numbers.stream().reduce(0,(a,b)->a+b));
        Optional result = numbers.stream().reduce((a, b)->a+b);
        System.out.println(result);
        System.out.println(result.isPresent()?result.get():0);

        //find out which book has max page
        Optional<Book> book = BookService.getAll().stream().reduce((a, b)->a.getPage()>b.getPage()?a:b);
        System.out.println(book.isPresent()?book.get():null);

        //sum all book page is tags is java
        System.out.println(BookService.getAll().stream().filter(b->b.getTags().contains("Java")).map(Book::getPage).reduce(0,Integer::sum));
    }
}
