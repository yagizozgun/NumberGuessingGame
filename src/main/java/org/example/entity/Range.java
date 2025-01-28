package org.example.entity;

public class Range {

    private int firstNumber;
    private int secondNumber;

    public Range() {}

    public Range(int firstNumber, int secondNumber)
    {this.firstNumber = firstNumber; this.secondNumber = secondNumber;}

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {return firstNumber;}

    public int getSecondNumber() {return secondNumber;}
}
