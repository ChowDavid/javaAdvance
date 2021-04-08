package com.david.learn.funcprogramming.demo.jdk8.section9;


import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class AggregateDemo {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,1000).sum();
        OptionalInt min = IntStream.rangeClosed(1,1000).min();
        System.out.println(min.isPresent()?min.getAsInt():"Not Found");
        OptionalDouble average = IntStream.rangeClosed(1,5000).average();
        System.out.println(average.isPresent()?average.getAsDouble():"Not Found");

    }
}
