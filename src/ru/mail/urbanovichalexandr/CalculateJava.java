package ru.mail.urbanovichalexandr;

import java.util.Scanner;

public class CalculateJava {
    public static void main(String[] args){
        double a = 0, b = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1'st number: ");
        try {
            a = sc.nextDouble();
        } catch (Exception e){
            System.out.println("Wrong input.");
        }

        System.out.println("Enter operation: ");
        String op = sc.next();

        System.out.println("Enter 2'st number: ");
        try {
            b = sc.nextDouble();
        } catch (Exception e){
            System.out.println("Wrong input.");
        }

        sc.close();

        System.out.println("Result: " + Calculate.metodCalculate(a, op, b));

    }
}
