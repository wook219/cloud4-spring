package com.elice.project.week6.day2.ex.Q4;

public class FactorialWithFor implements Factorial {
    @Override
    public void factorial(long n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("[for문] " + n +"의 팩토리얼: " + + result);
    }
}
