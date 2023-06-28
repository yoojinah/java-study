package ch02;

public class Compare {
    public static void main(String[] args) {
        // 동등 비교 연산자 ( 똑같은지 비교 )
        int a = 5;
        int b = 3;
        boolean result = (a == b);

        System.out.println(result);
        System.out.println("------------");


        String str = "abc";
        String str2 = "abc";
        boolean resultStr = (str == str2);
        boolean resultStrNot = (str != str2);
        System.out.println(resultStr);
        System.out.println(resultStrNot);
        System.out.println("------------");


        String str3 = new String("abc");
        String str4 = new String("abc");
        boolean resultStr2 = (str3.equals(str4)) ;
        boolean resultStr3 = (!str3.equals(str4));
        // 논리적으로 반대의 연산을 하고 싶을 때 --> !를 앞에
        // 정확히는 결과값이 반대로 변환됨
        System.out.println(resultStr2);
        System.out.println(resultStr3);
        System.out.println("------------");


        // 부등 비교 연산자 (not equal) 서로 다른가?
        // ! --> (not)
        boolean resultNot = (a != b);
        System.out.println(resultNot);
        System.out.println("------------");
        // 문자열 비교할때는 동등 비교 연산자 (==)를 쓰지 않는다



    }
}
