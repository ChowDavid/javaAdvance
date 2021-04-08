package com.david.learn.funcprogramming.demo.jdk8.section9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingDemo {

    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1,500).boxed().collect(Collectors.toList());
        List<Integer> numbers2 = IntStream.rangeClosed(1,500).mapToObj(Integer::valueOf).collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(numbers2);
    }
}
