public class FinancialForecast {
    public static double futureValue(double principal, double rate, int years) {
        // Base Case: If 0 years, return the original amount
        if (years == 0) {
            return principal;
        }

        // Recursive Case: Multiply this year's growth and call for previous year
        return futureValue(principal, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double initialAmount = 10000; // Starting amount
        double annualGrowthRate = 0.08; // 8% annual growth
        int years = 5;

        double predictedValue = futureValue(initialAmount, annualGrowthRate, years);
        System.out.printf("Predicted value after %d years: ₹%.2f%n", years, predictedValue);
    }
}
