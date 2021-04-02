package com.david.learn.funcprogramming;

import java.util.Arrays;
import java.util.List;

public class BookService {

    public static List<Book> getAll(){
        Book book1 = new Book("Java",600,true);
        Book book2 = new Book("JPA",500,true);
        Book book3 = new Book("CookBook",200,false);
        return Arrays.asList(book1,book2,book3);
    }
}
