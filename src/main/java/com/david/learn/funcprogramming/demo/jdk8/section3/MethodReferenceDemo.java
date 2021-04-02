package com.david.learn.funcprogramming.demo.jdk8.section3;

import com.david.learn.funcprogramming.dto.Book;
import com.david.learn.funcprogramming.service.BookService;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

/**
 * :: is a short hand called by lamdba expression
 * Class::staticMethod
 * object::referenceMethod
 * Class::new Constructor
 * not allow method has operation such as System.out.println(x*10)
 */
public class MethodReferenceDemo {
    public static void main(String[] args) {
        IntConsumer consumer = (x) -> System.out.println(x);
        IntConsumer consumer1 = System.out::println;
        consumer.accept(10);
        consumer1.accept(20);
        Function<Integer,Double> sqrt = Math::sqrt;
        System.out.println(sqrt.apply(16));
        Function<String, String> lowerCaseFunction = String::toLowerCase;


        IntBinaryOperator maxOperator1 = (a,b) -> Math.max(a,b);
        IntBinaryOperator maxOperator = Math::max;
        System.out.println(maxOperator.applyAsInt(10,-10));

        Predicate<Book> ebook = (i)->i.isEBook();
        Predicate<Book> eBookRef = Book::isEBook;
        BookService.getAll().forEach((i)->{
            if (eBookRef.test(i)){
                System.out.println(i);
        }});


    }
}
