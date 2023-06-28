package ch03;

public class Conditions {
    public static void main(String[] args) {
        // 조건문(condition)
        // 코드를 실행할지 말지 결정할 때 사용
        // 프로그램의 로직(logic)을 제어하는 핵심적인 부분

        int age = 50;

        // 조건식 : true/false를 반환하는 식

        // if-else문
        // if문의 조건식이 true면 if(){}안의 코드가 실행
        // if문의 조건식이 false면 else(){}안의 코드가 실행
        if(age >= 18){
            System.out.println("성인입니다."); //식이 true일때 구문
        } else {
            System.out.println("미성년자입니다."); //식이 false일때 구문
        }

        // else-if
        // 맨 위의 조건이 맞을땐 해당 블록만 실행
        if(age >= 60){
            System.out.println("노인입니다.");
        } else if (age >= 40) {
            System.out.println("장년입니다");
        } else if(age >= 18){
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

    }
}
