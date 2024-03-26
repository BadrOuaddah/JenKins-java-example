package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello Friend!");

        Calculator calculator = new Calculator();

        float addition = calculator.addition(5F, 5F);

        System.out.println(addition);
    }
}