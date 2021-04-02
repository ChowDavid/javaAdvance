package com.david.learn.funcprogramming.demo.jdk8.section3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> c = (x) -> System.out.println(x.length()+" the value of x: "+x);
        c.accept("up in the air");

        //consume with block statement
        Consumer<Integer> d = (x) -> {
            System.out.println("X * X ="+x*x);
            System.out.println("X / X ="+x/x);
        };
        d.accept(10);

        //forEach
        System.out.println("Consumer Demo List forEach");
        Consumer<String> e = (x) -> System.out.println(x.toUpperCase());
        Consumer<String> l = (x) -> System.out.println("Length "+x.length());
        List<String> names = Arrays.asList("David","Chow","Ken","Patrick");
        names.forEach(e.andThen(l));

        //loop through for length > 3 and print it out
        System.out.println("------------------");
        names.forEach((x)-> {
            if (x.length()>3){
                e.accept(x);
            }
        });

        System.out.println("-------------------");
        names.forEach((x)-> {
            if (x.length()>3){
                e.andThen(l).accept(x);
            }
        });

        System.out.println("-------------------");
        IntConsumer intConsumer = (a) -> System.out.println(a * 10);
        intConsumer.accept(10);


    }
}