### Exercise 2: Implementing Dependency Injection

Scenario:
In the library management application, you need to manage the dependencies between the BookService and BookRepository classes using Spring's IoC and DI.

Steps:

1. Modify the XML Configuration:
   - Update `applicationContext.xml` to wire `BookRepository` into `BookService` using the `<property>` tag.

2. Update the BookService Class:
   - Add a `setBookRepository(BookRepository bookRepository)` method to `BookService` and store the dependency in a field.

3. Test the Configuration:
   - Run `LibraryManagementApplication` and verify the output from `bookService.findBook()`. 