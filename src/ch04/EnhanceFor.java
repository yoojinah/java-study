package ch04;

public class EnhanceFor {
    public static void main(String[] args) {
        // 향상된 for문
        // 배열같이 여러개의 값을 저장할 수 있는 자료구조를 순차적 탐색
        // 처음부터 끝까지 반복문을 돈다.

        int[] numbers = {1,2,3,4,5};
        // 향상된 for문을 이용해 배열 순회
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("배열의 합:" + sum);

        int[] arr = {2,4,5,21,6};
        int max = arr[0];
        for (int numb : arr) {
            if (numb > max) {
                max = numb;
            }
        }
        System.out.println("최대값은" + max);



    }
}
