package com.david.learn.funcprogramming.demo.section3;

import java.util.function.UnaryOperator;

/**
 * UnaryOperator extends from Function
 * Single parameter and return same type
 * Other UnaryOperator such as IntUnaryOperator, LongUnaryOperator, DoubleUnaryOperator
 */
public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<Integer> unary = (i) -> i * 10;

        System.out.println(unary.apply(10));
        System.out.println(UnaryOperator.identity());


    }
}
