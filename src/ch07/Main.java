package ch07;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("유진아", 28);
        p.introduce();

        Student s = new Student("유진아",28, "01");
        s.introduce();

        // 업 캐스팅 Student 객체를 Person타입으로 변환(부모타입으로 변환)

        Person p2 = s;

        // 부모 객체의 자식 객체에서 재정의된 메서드 호출
        // 자식 객체의 메서드/필드는 호출 불가      ex) p2.study()
        p2.introduce();


        // 부모 객체를 자식 객체에 대입
        // 명시적 형변환(강제 형변환)
        // 그냥 형변환하게 되면 에러발생 가능성
        // 부모객체변수 instanceof(....) 자식클래스타입
        // 형변환 하기 전 if문을 꼭 써줘야 함
        if (p2 instanceof Student) {
            Student s2 = (Student) p2;
            s2.study();
        } else {
            System.out.println("student 클래스가 아닙니다");
        }


        //다형성(polymorphism)
        // work(new Student(...));
        // work(new Lecturer(...));







    }
}
