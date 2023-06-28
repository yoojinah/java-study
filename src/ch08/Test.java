package ch08;

public class Test {
    static void testArea(Shape shape) {
        double expectdeResult = 100;
        double actualResuit = shape.calculaterArea();
        if (actualResuit == expectdeResult) {
            System.out.println("너비 구하기 테스트 성공");
        } else {
            System.out.println("너비 구하기 테스트 오류");
        }

    }

    static void testPerimeter(Shape shape) {
        double expectdeResult = 40;
        double actualResuit = shape.calculaterPerimeter();
        if (actualResuit == expectdeResult) {
            System.out.println("둘레 구하기 테스트 성공");
        } else {
            System.out.println("둘레 구하기 테스트 오류");
        }

    }

    public static void main(String[] args) {
        // TDD 스타일로 개발하는 법
        Shape s = new Square(10);

        testArea(s);
        testPerimeter(s);
    }


    public void drawLines() {

    }

}
