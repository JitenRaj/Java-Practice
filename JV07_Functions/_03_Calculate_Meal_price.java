public class _03_Calculate_Meal_price {
    public static void CalculateTotalMealPrice(double listedMealPrice,double tipRate, double taxRate) {

        double tip = tipRate * listedMealPrice ;
        double tax = taxRate * listedMealPrice ;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is : " + result);
    }
    public static void main(String[] args) {
        CalculateTotalMealPrice(400, 0.1, 0.2);
        CalculateTotalMealPrice(200, .08, 0.3);
    }
}
