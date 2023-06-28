package ch03;

public class LoopWhile {
    public static void main(String[] args) {
        // while(반복문)
        //while(조건식){
        //  조건식이 true인 동안 실행될 코드
        //  조건이 false가 되는 탈출 구문이 일반적으로 존재
        // }

        int i = 0;
        while (i < 5){
            System.out.println("i의 값 :" + i);
            if (i == 2){
                // 반복문을 종료하고 빠져나옴, 이후 코드는 실행하지 않음
                // 가장 가까운 반복문을 종료하고 나옴
                // 다음 while문은 다시 실행됨
                break;
            }
            i++;
        }
        System.out.println("반복문 종료");
    }
}
