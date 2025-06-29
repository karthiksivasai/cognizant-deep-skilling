# Singleton Pattern - Logger Example

This is my implementation of the Singleton pattern using a Logger class.

## What it does

The Logger class makes sure only one instance exists. No matter how many times you call `getInstance()`, you always get the same object.

**Logger class**: 
- Has a private constructor so you can't create new instances directly
- Uses `getInstance()` method to get the single instance
- Has a `log()` method to print messages

**LoggerTest class**: 
- Tests the singleton by getting the logger twice
- Checks if both references point to the same object
- Logs some messages to show it works

## Running the code

Compile:
```sh
javac LoggerTest.java
```

Run:
```sh
java LoggerTest
```

## What you'll see

![Example Output](output.png)

The output shows:
- Logger creation message
- Two log messages
- Confirmation that both logger instances are the same object

This proves the Singleton pattern is working correctly.
