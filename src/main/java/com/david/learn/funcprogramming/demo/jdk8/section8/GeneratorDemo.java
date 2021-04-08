package com.david.learn.funcprogramming.demo.jdk8.section8;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.*;

public class GeneratorDemo {

    public static void main(String[] args) {
        System.out.println(Arrays.asList(1,2,3,4,5).stream().collect(Collectors.toList()));
        System.out.println(Stream.of(1,2,3,4,5).collect(Collectors.toList()));
        System.out.println(Stream.of(new Integer[]{1,2,3,4,5}).collect(Collectors.toList()));
        System.out.println(Stream.iterate(0,i->i+1).limit(10).collect(Collectors.toList()));
        System.out.println(Stream.generate(new Random()::nextInt).limit(5).collect(Collectors.toList()));

        //IntStream
        System.out.println("IntStream");
        IntStream.of(1,2,3,4,5).forEach(System.out::println);
        IntStream.range(1,5).forEach(System.out::println);
        IntStream.rangeClosed(1,5).forEach(System.out::println);

        System.out.println("LongStream");
        LongStream.of(1,2,3,4,5).forEach(System.out::println);
        LongStream.range(1,5).forEach(System.out::println);
        LongStream.rangeClosed(1,5).forEach(System.out::println);

        System.out.println("DoubleStream");
        DoubleStream.of(1,2,3,4,5).forEach(System.out::println);
        LongStream.range(1,5).asDoubleStream().forEach(System.out::println);
        LongStream.rangeClosed(1,5).asDoubleStream().forEach(System.out::println);

    }
}
