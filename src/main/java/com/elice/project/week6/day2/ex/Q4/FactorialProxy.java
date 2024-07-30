package com.elice.project.week6.day2.ex.Q4;

public class FactorialProxy implements Factorial{

    private Factorial delegator;

    // 지시사항을 참고하여 코드를 작성해 보세요.
    public FactorialProxy(Factorial delegator){
        this.delegator = delegator;
    }

    @Override
    public void factorial(long n) {
        long startTime = System.nanoTime();
        delegator.factorial(n);
        long endTime = System.nanoTime();
        System.out.printf("호출 클래스: %s\n", delegator.getClass().getSimpleName());
        System.out.printf("실행 시간: %dns\n", (endTime - startTime));
        System.out.println("---------------------------------------");
    }
}
