public class Main {

    public static void main(String[] args) {

        FinancialForecast forecast =
                new FinancialForecast(10000, 0.08, 5);

        double futureValue =
                ForecastCalculator.predictValue(
                        forecast.getCurrentValue(),
                        forecast.getGrowthRate(),
                        forecast.getYears());

        System.out.printf("Current Value : ₹%.2f%n", forecast.getCurrentValue());
        System.out.printf("Growth Rate   : %.0f%%%n", forecast.getGrowthRate() * 100);
        System.out.printf("Years         : %d%n", forecast.getYears());
        System.out.printf("Future Value  : ₹%.2f%n", futureValue);
    }
}