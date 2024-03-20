package org.example;

public class Calculator {

    private float number_1;
    private float number_2;

    public Calculator() {
    }

    public Calculator(float number_1, float number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }

    public float getNumber_1() {
        return number_1;
    }

    public void setNumber_1(float number_1) {
        this.number_1 = number_1;
    }

    public float getNumber_2() {
        return number_2;
    }

    public void setNumber_2(float number_2) {
        this.number_2 = number_2;
    }

    public float addition(float number_1, float number_2){
        return number_1 + number_2;
    }

    public float subtraction(float number_1, float number_2){
        return number_1 - number_2;
    }

    public float multiplication(float number_1, float number_2){
        return number_1 * number_2;
    }

    public float division(float number_1, float number_2){
        return number_1 / number_2;
    }

    public float modulus(float number_1, float number_2){
        return number_1 % number_2;
    }
}
