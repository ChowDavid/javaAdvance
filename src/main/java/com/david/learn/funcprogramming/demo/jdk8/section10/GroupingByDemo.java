package com.david.learn.funcprogramming.demo.jdk8.section10;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GroupingByDemo {
    public static void main(String[] args) {
        //Group by map online then list of book
        Map<Boolean, List<Book>> bookGroup = BookService.getAll().stream()
                .collect(groupingBy(Book::isEBook));
        printOutput(bookGroup);
        Map<String, List<Book>> ebookGroup = BookService.getAll().stream()
                .collect(groupingBy(b->b.isEBook()?"eBook":"Book"));
        printOutput(ebookGroup);

        //groupingBY classifier + downstream handling
        //group by ebook and filter out if page <100
        Map<String, List<Integer>> book3 = BookService.getAll().stream()
                .collect(groupingBy((b->b.isEBook()?"eBook":"Book"), mapping(Book::getPage,Collectors.toList())));
        System.out.println("book3 = " + book3);

        //Chnage the mapping to HashMap 
        //Classifier isEbook
        //mapfactory created as LinkedHashMap
        //downstream how the come
        Map<String,List<Integer>> book4 = BookService.getAll().stream()
                .collect(groupingBy((b->b.isEBook()?"eBook":"Book"), LinkedHashMap::new,mapping(Book::getPage,Collectors.toList())));
        System.out.println("book4 = " + book4);
    }

    private static <T> void printOutput(Map<T, List<Book>> bookGroup) {
        bookGroup.forEach((k,v)->{
            System.out.println(k+ " "+v);
        });
    }
}
