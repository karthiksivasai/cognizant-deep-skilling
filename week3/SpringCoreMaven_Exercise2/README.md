# Exercise 2: Implementing Dependency Injection

This exercise shows how to use Spring to manage dependencies between BookService and BookRepository.

## Scenario
You need to manage the dependencies between BookService and BookRepository using Spring's IoC and DI.

## Steps
1. Update applicationContext.xml to wire BookRepository into BookService using the <property> tag.
2. Add a setBookRepository(BookRepository bookRepository) method to BookService and store the dependency in a field.
3. Run the application and check the output from bookService.findBook(). 