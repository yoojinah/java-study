package ch07;

// extend 부모클래스
// 부모클래스의 필드 및 메서드를 상속 받는다.
// 상속 : 프로그래밍 언어에서 자식이 부모를 선택해서 물려받음
// SE(SW공학) -->generaliztion(일반화) --> inheritance(상속)

//                      상속을 받는 개념
// 여러개의 클래스를 구현하는데, 일반적인 속성(attribute)과 기능(operation)
// 그것을 부모 클래스로 만들고 나머지 클래스들은 상속받고 필요한 것만 추가

public class Student extends Person {
    private String studentId;    // 학번
    // Student클래스에 위 필드를 추가한 순간 Person클래스의 introduce() 메서드를 그냥 사용할 수 있음


    // 빈 생성자는 자동으로 상속을 받지만 매개변수가 있는 생성자는 상속할 때 별도로 선언해줘야함
    public Student(String name, int age, String studentId) {
        // super(); : 부모의 생성자를 호출
        // 부모 객체도 생성은 됨
        // 부모 클래스(Student)의 매개변수가 존재한다면 자식 메서드에서도 생성해줘야 사용할 수 있음
        super(name, age);
        // 자식클래스의 필드는 똑같이 한 번 더 생성해줘야 함
        this.studentId = studentId;
    }

    // 학생연구(공부) 기능
    // 부모 메서드외의 다른 메서드를 추가했다
    public void study() {
        System.out.println(name + "이(가) 공부를 시작합니다.");
    }

    // Override : 재정의한다.
    @Override
    public void introduce() {
        // 기존 Person의 introduce는 그대로 사용하고 뭔가를 추가하겠다
        // super(부모) 의 introduce() 호출 !
        super.introduce();
        System.out.println("제 학번은 " + studentId + "입니다.");
    }

}
