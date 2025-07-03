package org.example;

public class App {
    public String getGreeting(){
        return "Hello World!";
    }
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        System.out.println("2 + 3 = " + calc.sum(2, 3));
    }
}
