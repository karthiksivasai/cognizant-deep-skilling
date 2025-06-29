# Search Algorithms - Linear vs Binary

This compares two different ways to search for products in an array.

## Big O Notation

Big O tells you how slow an algorithm gets when you have more data. For searching:
- **Linear Search (O(n))**: Checks every item one by one
- **Binary Search (O(log n))**: Only works on sorted arrays, but much faster

## What the code does

**Product class**: Simple class with id, name, and category

**SearchAlgorithms class**: 
- `linearSearch()` - goes through each product until it finds the right one
- `binarySearch()` - keeps splitting the array in half to find the product faster

**SearchTest class**: Tests both methods and shows which one is faster

## Running it

Compile:
```sh
javac "week1/Algorithms_Data Structures/exercise2.java"
```

Run:
```sh
java -cp "week1/Algorithms_Data Structures" SearchTest
```

## Results

![Search Algorithms Output](output.png)

The output shows:
- Which index the product was found at
- How long each search took (nanoseconds)
- Binary search is way faster for large datasets

Binary search only works if your data is sorted first, but it's worth it for big arrays. 