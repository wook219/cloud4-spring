package com.elice.project.week6.day2.ex.Q2;

public class DIMain {
    public static void main(String[] args) {

        // 지시 사항을 참고하여 아래 코드를 수정하세요.
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);
        orderService.createOrder();
    }
}
