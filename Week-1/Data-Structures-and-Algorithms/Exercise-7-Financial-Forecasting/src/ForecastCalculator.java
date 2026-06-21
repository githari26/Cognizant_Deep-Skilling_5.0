public class ForecastCalculator {

    public static double predictValue(double amount, double growthRate, int years) {

        if (years == 0)
            return amount;

        return predictValue(amount * (1 + growthRate), growthRate, years - 1);
    }
}