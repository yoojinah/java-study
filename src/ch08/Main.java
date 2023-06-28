package ch08;

public class Main {
    public static void main(String[] args) {
        // 인터페이스 객체는 생성이 불가하다
        // 인터페이스를 쓰는 가장 큰 이유는 갈아 끼우기가 쉬워서
        // Shape ss = new Shape();  --> 불가능

        // 구현한 구현 클래스로만 생성이 가능
        Shape s = new Rectangle(10, 10);
        s.calculaterArea();
        System.out.println(s.calculaterArea());
        System.out.println(s.calculaterPerimeter());



    }
}
