package com.david.learn.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * Since Java 1.8
 * Implement functional programming
 * Two args andproduces a result
 * BiConsumer does not return any result
 */
public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (x,y)-> System.out.println("x*y="+x*y);
        biConsumer.accept(100,1);


        System.out.println("--------");
        List<Book> books = BookService.getAll();
        BiConsumer<String,Integer> biConsumer1 = (name,page)-> System.out.println("Book Name:"+ name+", page:"+page);
        books.forEach(b->biConsumer1.accept(b.getName(),b.getPage()));



    }
}
