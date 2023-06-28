package ch04;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        // 사용자로부터 터미널에서 키보드로 입력받을 때
        // Scanner를 초기화
//        Scanner scanner = new Scanner(System.in);
//
//        // 정수값 1개를 입력 받을 수 있음
//        // 커서 (프롬프트) 깜빡인다는 것은 입력 대기중
//        System.out.print("정수값을 입력하세요 : ");
//        int inputNum = scanner.nextInt();
//        System.out.println("입력받을 숫자는 : " + inputNum);

        int[] arr = new int[5];
        arr[2] = 7;
        System.out.println(arr[2]);

        String[] strings = new String[3];
        strings[0] = "java";
        strings[1] = "python";
        strings[2] = "c++";
        for (int i=0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }





        int[] jung = new int[7];

        for (int i=0; i < jung.length; i++) {
            jung[i] = i + 1;
            System.out.println(jung[i]);
        }

        int[] num = new int[5];
        num[4] = 123;
        for (int i=0;i<num.length;i++) {
            System.out.println(num[i]);
        }



        int[] nb = new int[6];
        int countt = 2;
        for (int i=1; i<=nb.length; i++) {
            nb[i] = countt;
            countt += 2;
            System.out.println(nb[i]);
        }









    }
}
