package ch04;

public class Array {
    public static void main(String[] args) {
        // 배열(array) : 동일한 타입의 여러개 값을 저장하는 자료구조(data structure)


        // 타입[] 배열이름 = new 타입[크기];
        // 배열 초기화 방법
        int[] newbers = new int[5]; // 크기가 5인 배열 생성

        // 배열 요소(element)의 값을 할당
        // 배열이름[번호(index)]
        newbers[0] = 10;
        newbers[1] = 5;

//        System.out.println(newbers[0]);

        // 배열의 크기
        // 배열이름.length
//        int arrayLength = newbers.length;
//        System.out.println(arrayLength);

        // 배열을 반복문으로 접근
        // 0에서 시작해서 배열의 길이보다 작을때까지

//        for (int i = 0; i < newbers.length; i++) {
//            System.out.println(newbers[i]);
//        }

        //배열 요소의 초기값을 넣어서 초기화
        int[] numbers = {5, 10, 15};
        for (int i = 0; i < newbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 배열의 크기를 나중에 정하기
        // 배열 크기 초기화, 숫자는 0 기반으로 초기화 됨
        int [] numbers2;
        numbers2 = new int[3];
        System.out.println(numbers2);
    }
}
