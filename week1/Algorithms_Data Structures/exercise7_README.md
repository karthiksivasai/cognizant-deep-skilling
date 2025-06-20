# Exercise 7: Financial Forecasting with Recursion

## What is Recursion?
Recursion is when a method calls itself to solve a problem. It is useful for problems that can be broken down into smaller, similar subproblems. For example, calculating powers, factorials, or traversing tree structures.

## What's in this code?
- A recursive method `forecast()` that predicts future value using the formula:
  - `futureValue = currentValue × (1 + growthRate)^years`
- A test class that calls `forecast()` with sample values and prints the result.

## How to Run
1. Compile the code:
   ```sh
   javac "week1/Algorithms_Data Structures/Exercise 7 - Financial Forecasting.java"
   ```
2. Run the test:
   ```sh
   java -cp "week1/Algorithms_Data Structures" FinancialForecastTest
   ```

## Example Output Screenshot

![Financial Forecast Output](output.png)

- The output shows the predicted value after a certain number of years.

## Time Complexity
- The `forecast()` method is **O(n)** because it makes one recursive call for each year.
- Recursion can sometimes repeat calculations (redundant work).
- To optimize, you can use memoization (store results) or use a loop (iteration) instead of recursion. 