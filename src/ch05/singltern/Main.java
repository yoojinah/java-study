package ch05.singltern;

public class Main {
    public static void main(String[] args) {
        // private로 막았기 때문에
//        Singleton s1 = new Singleton();

        // static으로 쓸 떄와 다른점은
        // 우리가 필요한 시점에만 생성할 수 있음
        // getInstance() 메서드로 생성
        Singleton s1 = Singleton.getInstance(); // 객체 생성
        Singleton s2 = Singleton.getInstance(); // 이전 생성된 것을 반환
        Singleton s3 = Singleton.getInstance(); // 이전 생성된 것을 반환
//        s1.hashCode();  --> 코드 값(ch05.singltern.Singleton@682a0b20)
        System.out.println(s1); // ch05.singltern.Singleton@682a0b20
        System.out.println(s2); // ch05.singltern.Singleton@682a0b20
        System.out.println(s3); // ch05.singltern.Singleton@682a0b20

        int[] arr = {1,2,3,4,5};
        Singleton s11 = Singleton.getInstance();

        s11.multifly(arr);
        Test1 t1 = new Test1();
        t1.test();

        Test2 t2 = new Test2();
        t2.test();

    }
}
