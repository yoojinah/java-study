package ch05;

// 주문정보
// 상거래 시스템의 기본
// 물건구매, 예약, 배달, 중고거래
// 소프트웨어 개발자는 데이터/정보를 다루는 사람이다
// 데이터/정보 : 문자열, 숫자, 문서파일,이미지(간혹)
// 예약어 : 일반적으로 시스템에서 사용하는 용어 예) order
// PurchaseOrder(구매주문)

// 일반적으로 class는 public으로
// class이름은 파스칼 케이스(대문자로 시작단어)
// 그외, kebob-case(order-info, 주소url, 사이트명칭, 컴포넌트 이름....)
// snake-case(order_info)

public class OderInfo {
    // 필드 (멤버변수, 자바에서는 거의 field라고 함)
    // 클래스에 선언된 변수를 필드라고함
    // 필드는 자바에서 일반적으로 private를 앞에 사용
    // 데이터/정보 1건에 이름/번호를 붙이는 것은 당연한 것
    private String orderId;    // 주문번호
    private String customerName;  //고객명
    private String productName;  //제품명
    private String totalPrice;  //주문금액
    private String quantity;  //주문수량(개수)


    // 메서드(method)
    // 클래스의 기능적인 부분, 실행하고 수행할 수 있는 단위 코드
    // 메서드도 일반적으로 앞에 public
    // 메서드도 카멜케이스


    // 클래스명과 동일한 메서드를 생성자(Constructor)
    // 객체(object)를 생성할때 사용
    // 객체는 object, instance라고 하고 클래스로 찍어낸 것
    //---------------------------------------------------


    // 변수
    // 자료형 변수명
    // 클래스 : 개발자가 만들어낸 자료형

    //---------------------------------------------------



    // 객체를 생성
    // 클래스명 객체명 = new 클래스명("", "", "");

    public OderInfo(String orderId, String customerName, String productName, String totalPrice, String quantity) {
        // this란 현재 객체를 말함
        // this.필드명 : 현재 객체 필드에 접근
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Quantity: " + quantity);
    }

    public void increaseQuantity(int additionalQuantity) {
        quantity += additionalQuantity;
        System.out.println("수량이 추가되었습니다. 총 수량: " + quantity);
    }

    // setter : 필드의 값을 변경할 떄 사용
    // public void set필드명(....)
    public void setOrderId(String orderId) {

        this.orderId = orderId;
    }



    // getter : 필드값을 반환할떄 사용






    // 메서드 작성방식
    // [공개범위(public / private)] [반환타입 (String, void)] [메서드 이름] (매개변수) {
    //     실행되는 코드 ...
    //     [return 반환값]
    // }
}
