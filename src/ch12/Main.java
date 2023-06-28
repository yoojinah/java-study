package ch12;

public class Main {
    public static void main(String[] args) {
        MyService srv1 = new MyService("수강관리 서비스");
        MyService srv2 = new MyService("학생정보관리 서비스");

        srv1.start();   // 스레드 시작
        srv2.start();


    }
}
