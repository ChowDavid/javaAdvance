package com.david.learn.funcprogramming.demo.section3;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookFactory;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * for functional interface only
 * Cannot create Book book = Book::new because Book is not functional Interface
 * Create a functional interface with abstract method has match parameter with Contrauctor to create an object
 *
 */
public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        //BookFactory is Functional Interface
        //Book has more than one constructor
        //it will match the constructor with same parameter with method
        //FI will match the constructor so that call the abstract method. it will call the constructor
        BookFactory bf = Book::new;
        Book book = bf.getBook("Java",100,false, new ArrayList<>(Arrays.asList("")));
        System.out.println(book.toString());



    }
}
