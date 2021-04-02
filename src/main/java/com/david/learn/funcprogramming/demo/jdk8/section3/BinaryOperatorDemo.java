package com.david.learn.funcprogramming.demo.jdk8.section3;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * Two parameters and single return
 * All are same type
 * such as 1 + 2 output 3
 * It has minBy and maxBy on top of Function
 * IntBinaryOperator, LongBinaryOperator, DoubleBinaryOperator
 */
public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (x,y) -> x + y;
        System.out.println(sum.apply(1,2));//output 3

        Comparator<Integer> comparator = (a,b)->a.compareTo(b);
        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
        BinaryOperator<Integer> minBi = BinaryOperator.minBy(comparator);
        System.out.println(maxBi.apply(2,3));// output 3
        System.out.println(minBi.apply(2,3));// output 2



    }
}
