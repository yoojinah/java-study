package ch02;

public class CompareSize {
    public static void main(String[] args) {
        // 크기 비교 연산자
        int a = 5;
        int b = 3;
        // 연산은 왼쪽이 기준
        boolean result1 = (a > b);
        // a가 b보다 큰가? (greater than , gt)
        boolean result2 = (a < b);
        // a가 b보다 작은가? (less than, lt)
        System.out.println(result1);
        System.out.println(result2);

        boolean result3 = (a >= b);
        // a가 b보다 크거나 같은가?
        boolean result4 =  (a <= b);
        // a가 b보다 작거나 같은가?



    }
}
