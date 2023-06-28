package ch05.overloading;

import ch05.accessModifier.Animal;
import ch05.singltern.Singleton;

public class Operator {

    // 메서드 오버로딩(method overloading)
    // 메서드 이름은 동일함
    // 매개변수의 개수 또는 타입이 다른 경우를 말한다.

    // 메서드 시그니처(method signature)
    // 어떤 메서드가 나타내는 껍데기(프로토타입, 선언부)
    // 메서드 이름 + 매개변수(개수, 타입)이 동일하면 가능 (형변환 불가)


    // 정수값 2개를 받고 곱하는 과정을 적은 메서드
    public int multiply(int x, int y) {
        System.out.println("(int, int)");
        return x * y;
    }


    // 실수값 2개 받고 곱하는 과정을 적은 메서드
    public double multiply(double x, double y) {
        System.out.println("(double, double)");
        return x * y;
    }



//    public int multifly(int[] nums) {
//        if (nums == null) {
//
//        }
//
//        int sum = 1;
//        for (int num : nums) {
//            sum += num;
//        }
//        return sum;
//    }

    // 오버로딩 불가능
//    public int multiply(double x, double y) {
//        System.out.println("(int, int)");
//        return (int) (x * y);
//    }

    int a;
    void aa(){
        this.a = 10;
    }

    static int b;
    void bb(){
        b = 20;
    }

    public static void main(String[] args) {
        Operator sampleA = new Operator();
        Operator sampleB = new Operator();
        sampleA.a=300;
        System.out.println(sampleB.a);
        System.out.println(sampleA.a);
    }


}
