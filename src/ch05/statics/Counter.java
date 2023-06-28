package ch05.statics;

public class Counter {
    // static 필드
    // 클래스의 모든 객체(인스턴스)에 값이 공유되는 것
    private static int count = 0;

    public Counter() {
        count++;  // 정적 변수 값 증가
    }

    // static 메서드



    public static int getCount() {
        return count++;  // 정적 변수 반환
    }
}
