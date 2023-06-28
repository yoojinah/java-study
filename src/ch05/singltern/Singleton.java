package ch05.singltern;

public class Singleton {
    // private static 클래스 객체


    private static Singleton instance;

    // private 생성자
    // 외부에서 객체 생성 불가
    private Singleton() {
        // private 생성자
    }

    public int multiply(int x, int y) {
        System.out.println("(int, int)");
        return x * y;
    }


    // 실수값 2개 받고 곱하는 과정을 적은 메서드
    public double multiply(double x, double y) {
        System.out.println("(double, double)");
        return x * y;
    }

    // getInstance 메서드로 처음에 생성한 객체만
    // 접근하게 하는 방법
    // 객체 생성은 첫번째 메서드 호출 시 한 번만
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
            System.out.println("객체가 생성되었습니다.");
        }
        return instance;
    }

    public int multifly(int[] arr) {

        int sum = 1;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }




    // 이것 또한 오버로딩임
//    public Singleton(Singleton instance) {
//        this.instance = instance;
//    }
}

