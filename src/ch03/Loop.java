package ch03;

public class Loop {
    public static void main(String[] args) {
        // 반복문(loop)
        // 특정 조건이 만족되는 동안 계속해서 실행되는 코드
        // 1. for문 (초기화; 조건식; 증감식) {반복해서 실행할 코드}

        // 1. 가장 처음에 초기화 식이 실행 int i=0;
        // 2. 조건식 실행, i<5
        // 3. 조건이 true이면 블록안의 코드 실행
        // 4. 증감식 실행 예:) ++, --
        // 다음부터는 조건식 --> 블록코드 --> 증감식
        // 조건이 false가 되면 반복문 종료

        //continue는 이후에 있는 다음 코드를 skip하고 다음 반복문 실행
        // 가장 가까운 다음 반복문 실행
//        for (int i = 0; i < 5; i++){
//            if (i == 2) {
//                continue;
//            }
//            System.out.println("i의 값 :" + i);
//        }

        for (int i = 1; i <= 10; i++){
            System.out.println("i:" + i);
        }

        for (int y = 1; y <= 100; y++){
            if (y % 2 != 0) {
                System.out.println(y);
            }
        }

        for (int t =1; t <= 9; t++) {
            System.out.println("5 * " + t + "=" + (5 * t));
        }

        for (int w=10; w >= 1; w--){
            System.out.println(w);
        }

        for (int u =1; u <=5; u++){
            for (int j =1; j <= 5 - u; j++){
                System.out.println(" ");
            }
            for (int k = 1; k <= u; k++){
                System.out.println("*");
            }
            System.out.println();

        }

        for (int ie=1; ie <=10; ie++){
            System.out.println(ie);
        }

        for (int eu=10; eu >=1; eu--){
            System.out.println(eu);
        }

        for (int r=2; r <=20; r++){
            if (r % 2 == 0){
                System.out.println(r);
            }
        }

        int ye = 6;
        for (int yuk=1; yuk <=9; yuk++){
            System.out.println(ye + " * " + " = " + (ye * yuk));
        }

        for (int gg = 2; gg <=9; gg++){
            for (int ggd =1; ggd <=9; ggd++){
                System.out.println(gg * ggd);
            }
        }


        int sum = 5;
        for (int o = 1; o <=9; o++){

        }
        System.out.println(sum);


        for (int f=1; f <= 100; f++){
            if(f % 2 !=0){
                System.out.println(f);
            }
        }

        int ch = 7;
        for (int cc=1; cc <=9; cc++){
//            System.out.println(ch * cc);
            System.out.println(ch + "x" + cc + "=" + (ch * cc));
        }

        for (int tr=10; tr >=1; tr--){
            System.out.println(tr);
        }


        for (int lk =1; lk <=50; lk++){
            if (lk % 7 == 0) {
                System.out.println("7배수");
            }
        }

        for (int pa =10; pa >=0; pa--){
            System.out.println(pa);
        }

        for (int ss=9; ss >=1; ss--){
            System.out.println("7 x" + ss + "=" + (7 * ss));
        }

        for (int ff = 0; ff <=100; ff++) {
            if (ff % 3 == 0 || ff % 5 == 0) {
                System.out.println(ff);
            }
        }

        for (int yy = 10; yy >= 1; yy--){
            if (yy % 2 == 0) {
                System.out.println(yy);
            }
        }

        for (int i = 1; i <= 6; i++){
            for (int s=6; s>=1; s--){
                if (i + s == 6) {
                    System.out.println("첫번째 주사위" + i + " " + "두번째 주사위" + s);
                }
            }
        }






    }
}
