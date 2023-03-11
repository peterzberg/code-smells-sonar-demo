package com.zberg.sample.sonar.demo;

public class MyFancyCalculator {

    private final String calculatorName;
    private String missingString;

    public MyFancyCalculator(String name) {
        this.calculatorName = name;
    }

    public String getCalculatorName()
    {
        return calculatorName;
    }

    public int add(int summand1, int summand2){
        return summand1 + summand2;
    }

    private int multiply(int something, int somethingElse){
        return something * something;
    }

}
