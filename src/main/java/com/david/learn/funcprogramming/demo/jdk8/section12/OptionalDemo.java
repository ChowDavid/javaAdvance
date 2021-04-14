package com.david.learn.funcprogramming.demo.jdk8.section12;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Integer[] integers = new Integer[12];
        //System.out.println(integers[0].intValue());
        //Optional.ofNullable
        Optional<Integer> integer = Optional.ofNullable(integers[0]);
        System.out.println(integer.isPresent()?integer.get().intValue():0);

        //Optional.ofEmpty
        Optional<String> string = Optional.of("Hello World");
        System.out.println(string.isPresent()?string:Optional.empty());
        string = Optional.ofNullable(null);
        System.out.println(string.isPresent()?string:Optional.empty());
        System.out.println(Optional.empty().get());//Exception no value present




    }
}
