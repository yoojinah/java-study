package ch02;

public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        // AND(논리형) 연산자 &&(ampersand)
        // && : 모든값이 충족해야함 false가 하나라도 있으면 false값이 출력
        boolean result = a && b;
        // short-circuit evaluation(단락평가)
        // 왼쪽값에 의해서 연산 결과를 출력할 수 있으면, 오른쪽 값은 판단하지 않음
        boolean result2 = b && a;

        System.out.println(result);
        System.out.println(result2);
        System.out.println("---------------");


        // OR(논리합) 연산자 ||(pipe)
        boolean result3 = a || b;
        // OR 연산은 둘중에 하나라도 true면 true, 둘다 false면 false
        System.out.println(result3);
    }
}
