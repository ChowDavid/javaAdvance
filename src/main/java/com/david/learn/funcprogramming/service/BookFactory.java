package com.david.learn.funcprogramming.service;

import com.david.learn.funcprogramming.dto.Book;

import java.util.List;

@FunctionalInterface
public interface BookFactory {
     Book getBook(String name, int page, boolean ebook, List<String> tags);

}
