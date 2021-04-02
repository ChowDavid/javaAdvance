package com.david.learn.funcprogramming.demo.jdk8.section3;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer,Double> sqrt = (n) -> Math.sqrt(n);
        System.out.println(sqrt.apply(64));

        Function<String,String> lowerCase = (n) -> n.toLowerCase();
        Function<String, String> concat = (n) -> n.concat(" in Java");
        System.out.println("Lower case "+lowerCase.apply("David"));
        System.out.println(lowerCase.andThen(concat).apply("PROGRAMMING"));
        System.out.println(lowerCase.compose(concat).apply("PROGRAMMING"));

    }
}
