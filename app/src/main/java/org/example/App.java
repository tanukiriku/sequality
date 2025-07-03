package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculate calc = new Calculate();
        System.out.println("Sum of 2 and 3 is " + calc.sum(2, 3) + ". Average is " + calc.average(2, 3) + ".");
        System.out.println("Sum of 1 to 10 is " + calc.total(1, 10) + ". Average is " + calc.average(1, 10) + ".");
        System.out.println("Sum of odd of 1 to 10 is " + calc.oddTotal(1, 10) + ".");
        System.out.println("Sum of even of 1 to 10 is " + calc.evenTotal(1, 10) + ".");
    }
}
