package com.elice.project.week6.day2.ex.Q1;

public class IoCContainer {
    public static void main(String[] args) {
        SimpleApplicationContext context = new SimpleApplicationContext();
        // 지시사항 4번을 참고하여 코드를 작성하세요.

        // UserService 빈 등록
        context.registerBean("name", new UserService());

        // 가져와서 사용자 이름을 출력
        Service service = (Service)context.getBean("name");
        System.out.println(service.getUserName());
    }
}
