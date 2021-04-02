package com.david.learn.funcprogramming.demo.jdk8.section7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        System.out.println(numbers.stream().reduce(0,(a,b)->a+b));
        Optional result = numbers.stream().reduce((a, b)->a+b);
        System.out.println(result);
        System.out.println(result.isPresent()?result.get():0);
    }
}
