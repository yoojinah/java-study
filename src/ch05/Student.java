package ch05;

public class Student {
    private String name;

    private int grade;

    // 메소드(function)
    // 학생 이름(name)을 저장하는 기능

    // 1. public 씀
    // 2. 메소드기능 이름(camel-case)
    // 3. 입력값을 받을 것인가?
    //    --> 매개변수 이름부터 -> 매개변수 타입
    // public void 메소드이름(매개변수(파라미터))

    // 4. 구현(implementation)할 코드를 작성
    // 5. 반환값이 있나 = 메서드를 실행(호출)하고 튀어나올 값 있나?
    //    --> 없다면 반환타입을 메서드명 앞에 적어줌(void)
    public void setName(String name) {
        // 여기는 학생이름을 입력 받아 저장하는 곳
        this.name = name;
    }

    // 학생 정보의 이름을 가져오는 메서드
    // 학생이름 필드에 넣었으면 반환해야지
    // 반환값의 자료형에 따라 작성

}
