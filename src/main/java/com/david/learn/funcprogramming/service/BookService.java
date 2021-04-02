package com.david.learn.funcprogramming.service;

import com.david.learn.funcprogramming.dto.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookService {

    public static List<Book> getAll(){
        Book book1 = new Book("Java",600,true, new ArrayList<>(Arrays.asList("Java","Basic")));
        Book book2 = new Book("JPA",500,true,new ArrayList<>(Arrays.asList("Java","JPA")));
        Book book3 = new Book("CookBook",200,false,new ArrayList<>(Arrays.asList("Java","Cookbook")));
        return Arrays.asList(book1,book2,book3);
    }
}
