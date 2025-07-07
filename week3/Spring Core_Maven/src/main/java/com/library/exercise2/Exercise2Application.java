package com.library.exercise2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exercise2Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("exercise2-context.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.findBook();
    }
} 