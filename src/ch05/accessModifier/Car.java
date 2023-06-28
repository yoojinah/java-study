package ch05.accessModifier;

// 차량 정보
public class Car {

    // 다른 클래스에서는 메서드로만 접근
    // public 메서드
    // public(공공)은 어디에서든(어떠한 클래스에서도) 접근 가능
    // protected 메서드는 다른 패기지!에서 사용불가
    public void startEngine() {
        BankAccount account = new BankAccount();
        // 다른 클래서에서 접근 불가능 메서드 (private)
//        account.deductFunds


        Animal animal = new Animal();
        // protected 메서드
        animal.eat();

        System.out.println("Engine started!");
    }
}
