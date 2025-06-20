# Exercise 2: Factory Method Pattern


What's in the code?

The code creates a system for making different kinds of documents (`Word`, `PDF`, `Excel`).

- `Document` interface: A simple interface that says all documents must have an `open()` method.
- Concrete Documents: `WordDocument`, `PdfDocument`, and `ExcelDocument` are the actual classes that implement the `Document` interface.
- `DocumentFactory` (Abstract Creator): An abstract class that declares the factory method `createDocument()`. It acts as a blueprint for other factories.
- Concrete Factories: `WordDocumentFactory`, `PdfDocumentFactory`, and `ExcelDocumentFactory` are the actual factories. Each one knows how to create a specific type of document.
- `DocumentFactoryTest`: A test class with a `main` method to show how to use the factories to create and open documents.

How to Run

1.  Compile the code
    ```sh
    javac "Design Patterns and Principles/DocumentFactoryTest.java"
    ```

2.  Run the program
    ```sh
    java -cp "Design Patterns and Principles" DocumentFactoryTest
    ```

Expected Output
```
Opening Word document...
Opening PDF document...
Opening Excel document...
```

Example Output Screenshot:

![Factory Method Pattern Output](output2.png) 