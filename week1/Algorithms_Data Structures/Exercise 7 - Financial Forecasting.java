class FinancialForecast {

    public static double forecast(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }

        return forecast(currentValue, growthRate, years - 1) * (1 + growthRate);
    }
}

class FinancialForecastTest {
    public static void main(String[] args) {
        double currentValue = 10000; 
        double growthRate = 0.05;   
        int years = 3;

        double predicted = FinancialForecast.forecast(currentValue, growthRate, years);
        System.out.println("Predicted value after " + years + " years: ₹" + predicted);
    }
}

/*
Time Complexity:
- The forecast() method is O(n) because it makes one recursive call for each year.
- Recursion can sometimes do the same calculation many times (redundant work).
- To make it faster, you can use memoization (store results) or use a simple loop (iteration).
*/ 