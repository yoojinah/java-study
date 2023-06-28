package ch05;
class TestClass {
    // default 접근제한 : 패키지!범위 (잘 안씀), 상속 불가
    void performTest() {

    }
}

public class ClassConcept {
    public static void main(String[] args) {
        // 클래스
        // 구조화된 데이터 구조를 생성하기 위한 틀(template)
        // 같은 역할은 수행하는 코드를 찍어서 사용하기 위한 (재사용)
        // OOP(Object Oriented based design) -> SDA(Service Oriented Architecture)
        // design : 코드 수준의 설계
        // OOP, 공학적인 방법론들은 규모확장과 관련이 있음
        // 단점:boiler-plate의 증가(코드를 시작하기 위한 기본 뼈대)

        // 첫번째 주문 정보 객체 생성
        OderInfo order1 = new OderInfo("OR001", "HONG DOW", "Product A", "49.99", "2");
        order1.displayOrderDetails();
//        System.out.println(order1.getOrderId());


        // 빈 생성자는 코딩을 안해도 기본적으로 만들어줌
        //
        // 두번째 주문 정보 생성
        OderInfo order2 = new OderInfo("OR002", "jina", "Product B", "33.3", "3");
        order2.displayOrderDetails();

        // 빈 생성자로 주문정보 객체 1개 생성
        // 데이터 값이 아무것도 없음


        // 자바는 다른 클래스에서 필드로 접근시에는 메서드로만 접근하도록 한다.





//        Student student1 = new Student("Jin ah", "2grade","30");
////        student1.printStudentInfo();




    }
}
