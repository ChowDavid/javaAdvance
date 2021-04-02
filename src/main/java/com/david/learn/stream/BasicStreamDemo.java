package com.david.learn.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * stream is not a data structure. It takes input from the collections, Arrays and IO channels
 * It only return the results as per the pipeline operations
 * Parallel opeartions are easy to perform with stream api without haveing to spawn multiple threads explicity.
 * Fork join which got introduced in Java 7 made it easy to perform parallel operation but stream api made it really simple
 *
 */
public class BasicStreamDemo {
    public static void main(String[] args) {
        //Intermediate Operation on Streams
        //Map
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        System.out.println(numbers);
        List<Integer> square = numbers.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);
        //filter predicated pass in the filter
        List<Integer> lessThan20 = square.stream().filter(x->x<20).collect(Collectors.toList());
        System.out.println(lessThan20);
        //Sorted vs comparator
        List<Integer> reverseOrder = square.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(reverseOrder);

        //Terminal Operations on stream
        //collect
        //forEach - iterate over the stream
        numbers.stream().map(x->x*x).forEach(y-> System.out.println(y));
        //reduce - reduction on the element of the stream
        Integer sum = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);



    }

}
