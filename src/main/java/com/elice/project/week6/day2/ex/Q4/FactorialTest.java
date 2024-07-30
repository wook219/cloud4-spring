package com.elice.project.week6.day2.ex.Q4;

public class FactorialTest {
    public static void main(String[] args) {
        FactorialProxy factorialProxy = new FactorialProxy(new FactorialWithFor());
        factorialProxy.factorial(20);

        FactorialProxy factorialProxy2 = new FactorialProxy(new FactorialWithRecursion());
        factorialProxy2.factorial(20);
    }
}
