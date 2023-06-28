package ch03;

public class ConditionsCase {
    public static void main(String[] args) {
        // switch문
        // 일주일에서 몇번째 요일인가
        int dayOfWeek = 4;
        //switch(변수){} 변수의 값에 따라서 나눠 실행
        //              case 뒤에 값과 일치하는 구문을 실행
        // break를 안쓰면 코드가 계속 실행되므로 구문 끝마다 꼭 써줘야함
        // 일치하는 case문을 찾지 못하면 defalut에 있는 코드를 실행 (break는 안써도됨)
        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일입니다.");
                break;
            case 2:
                System.out.println("화요일입니다.");
                break;
            case 3:
                System.out.println("수요일입니다.");
                break;
            default:
                System.out.println("목요일, 금요일, 토요일, 또는 일요일입니다.");
        }

        int x = 10;
        if(x > 10){
            System.out.println("큰 수");
        } else{
            System.out.println("작은수");
        }

//        int score = 80;
//        if(score >= 80){
//            System.out.println("통과");
//        } else {
//            System.out.println("불통과");
//        }

        int num = 0;
        if (num > 0){
            System.out.println("양수");
        } else if(num < 0){
            System.out.println("음수");
        } else{
            System.out.println("0");
        }

        int age = 25;
        if (age > 20){
            System.out.println("성인");
        } else {
            System.out.println("미성년자");
        }

        int month = 12;
        if (month == 1) {
            System.out.println("1월");
        } else if (month == 2) {
            System.out.println("2월");
        }

        int num1 = 5;
        int num2 = 7;

        if (num1 == num2) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }

        int a = 5;
        int b = 4;
        int c = 2;

        if (a > 0 && b > 0 && c > 0){
            System.out.println("양수");
        } else if (a < 0 || b < 0 || c < 0) {
            System.out.println("음수");
        } else {
            System.out.println("0");
        }

        int score = 20;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }



        int year = 2020;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }


    }
}
