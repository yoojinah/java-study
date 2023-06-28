package ch03;

public class LoopEx {
    public static void main(String[] args) {

        // 반복문을 돌리려면 가장 바깥 반복문이 행을 제어하는 반복문

        int n = 5;
        for (int i =1; i <= 5; i++) {
            // i =1 첫번째 행을 출력
            // i =2 두번째 행을 출력

            // 빈공간 출력
            // 5 - i(행번호) 만큼 출력
            for (int j= 1; j <=5-i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            // 2 * i(행번호) -1 만큼 출력
            for (int k=1; k <= 2*i -1; k++) {
                System.out.print("*");
            }
            // 밑줄 내리기
            System.out.println();
        }

    }
}
