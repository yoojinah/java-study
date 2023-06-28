package ch01;

public class Variables {
    public static void main(String[] args) {
        // 자바에서 변수(variables)
        // 변수? -> 이번 축구 게임에 변수가 있어서 잘 안 됐어 (관련이 전혀없음)
        // 변수: 이름이 있는 메모리 공간
        // 컴퓨터는 작업을 수행하려면 메모리에 뭔가가 올라가 있어야함.
        // 프로그래밍: 프로그래밍 언어(language)를 가지고 컴퓨터한테 일 시키는 것
        // 고객(사용자) -> 개발자 -> 프로그래밍언어 -> 컴퓨터한테 일

        // 변수 선언(declare)
        // 이름이 있는 메모리 공간 만들기
        // [메모리공간유형] [변수이름]
        // int(integer, 정수 -2929, 0, 342, 소숫점 없는 숫자, 0 포함)
        // age라는 이름에 공간에는 정수 값을 저장할 수 있다.
        // int 형식 변수에 저장 가능한 숫자 범위
        // 대략+- 20억 정도
        int age;
        // 값 할당(assignment)
        // 변수에 값을 저장
        age = 25;
        System.out.println(age);    // 로깅(logging), 작업 결과를 출력해서 확인

        // 변수이름
        // 숫자로 시작하면 안됩니다.
        // 일반적인(관례, convention) 소문자로 시작, 두번째 단어 부터는 대문자로 시작
        // 이런형태의 변수이름 표기법을 camel-case(카멜케이스) 표기법,
        int studentAge;

    }
}
