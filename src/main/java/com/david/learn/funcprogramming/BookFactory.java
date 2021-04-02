package com.david.learn.funcprogramming;

@FunctionalInterface
public interface BookFactory {
     Book getBook(String name,int page, boolean ebook);
}
