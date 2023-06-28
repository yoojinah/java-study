package ch05.accessModifier;

public class BankAccount {
    private int balance;  // private 필드


    // private 메서드는 클래스 내에서만 사용하기 위해
    private void deductFunds (int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("잔액부족");
        }
    }


}
