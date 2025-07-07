package com.library.exercise2;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void findBook() {
        bookRepository.getBook();
    }
} 