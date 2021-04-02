package com.david.learn.funcprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * variable used in lambda is finally or effectively final
 * not allow same name as local variable inside lambda as parameter
 * local variable used inside lambda once define cannot be changed.
 * But you can use variable in class level or instance level
 */
public class VariableLambdaDemo {

    private int m=0;

    public static void main(String[] args) {
        VariableLambdaDemo demo = new VariableLambdaDemo();
        demo.method();

    }

    public void method(){
        int k=0; //local variable
        //IntConsumer consumer = (a)-> System.out.println(a*10 + k++); compiled error
        IntConsumer consumer = (a)-> System.out.println(a*10 + k);
        Consumer<Book> consumer1 = (a) -> System.out.println(k+m++);
        List<Book> books = BookService.getAll();
        books.forEach(consumer1);
        //k++; //compiled error
        m++;
    }
}
