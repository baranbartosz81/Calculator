public class Calculator {

    public double addSome (double number1, double number2) {
        return number1 + number2;
    }
    public double substractSome (double number1, double number2) {
        return number1 - number2;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.addSome(4,35);
        System.out.println(result);
    }


}
