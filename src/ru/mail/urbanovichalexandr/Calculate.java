package ru.mail.urbanovichalexandr;

public class Calculate {
    public static double metodCalculate(double a, String op, double b) {
        double res = 0;
        switch (op) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                if (b < 0 && b > 0) {
                    res = a / b;
                    break;
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Error operation.");
                break;
        }
        return res;
    }
}
