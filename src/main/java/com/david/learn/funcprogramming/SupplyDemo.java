package com.david.learn.funcprogramming;

import java.util.function.Supplier;


/**
 * a function intergace that supplies a value of some type
 * factory interface
 */
public class SupplyDemo {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()-> (int) (Math.random()*1000);
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
