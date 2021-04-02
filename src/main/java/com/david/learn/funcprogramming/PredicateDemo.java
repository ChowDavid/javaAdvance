package com.david.learn.funcprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Since Java 8
 * Single arg return true or false
 */
public class PredicateDemo {
    public static void main(String[] args) {
        //if number is > 10 return true else false
        Predicate<Integer> p1 = (x) ->  x >10;
        System.out.println(p1.test(11));

        // i > 10 and i is even number
        Predicate<Integer> even =(x) -> x%2==0;
        System.out.println(p1.and(even).test(20));

        System.out.println(p1.or(even).test(4));


        Predicate<Book> largeBook = (x) -> x.getPage()>=200;
        Consumer<Book> printBook = (x)-> System.out.println("Book name:"+x.getName()+", page:"+x.getPage());
        List<Book> books = BookService.getAll();

        System.out.println("---Basic predication---");
        books.forEach((x)-> {
            if (largeBook.test(x)){
                printBook.accept(x);
            }
        });

        System.out.println("----Print book page more than 200---");
        books.stream().filter(largeBook).collect(Collectors.toList()).forEach(printBook);
    }
}
