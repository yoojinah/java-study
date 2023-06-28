package ch08;

// 인터페이스에서 추상메서드만 가져온 거라 필드 선언은 따로 해줘야함
public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculaterArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculaterPerimeter() {
        return 2 * Math.PI * radius;
    }


}
