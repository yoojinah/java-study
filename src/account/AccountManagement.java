package account;

import java.util.Scanner;

public class AccountManagement {
    private Account[] accountList;  // 계좌 목록 배열
    private int numAccounts;        // 계좌의 개수
    private Scanner scanner;        // 사용자 키보드 입력 객체

    // 최대 입력 가능한 계좌개수를 매개변수르 입력받는 생성자
    public AccountManagement(int maxSize) {
        accountList = new Account[maxSize]; // maxSize 갯수만큼 계좌 목록 배열을 생성한다.
        numAccounts = 0;                    // 현재 생성된 계좌의 갯수
        scanner = new Scanner(System.in);   // 사용자에게 입력받는 객체 생성
    }

    public void addAccount(String accountNumber, double balance) {
        // **코드 작성
        // 계좌번호와 초기 입금액을 입력 받고

        // 계좌 객체 생성 및 초기 입금액 초기화 (객체가 생성은 되어있고 값은 없는 상태)
        Account account = new Account(accountNumber, balance);

        // accountList라는 배열에 numAccount(생성된 계좌 개수 현재값:0)을
        // 증가시킨걸 생성한 객체에 넣어서 배열을 증가시켜라

        accountList[numAccounts++] = account;
        // 계좌객체를 생성한 후 배열의 앞에서부터 가장 처음 빈 공간에 추가한다.
        // 단, 배열에 추가한 후 numAccounts를 증가시킨다.
    }

    public void showAccountList() {
        // **코드 작성
        // 계좌 목록을 출력
        // 예시 출력 형태
        // ------------------------------------
        // 계좌번호: [계좌번호1], 잔액: [잔액1] = acount 객체
        // 계좌번호: [계좌번호2], 잔액: [잔액2]
        // ...
        // ------------------------------------

        // 향상된 for문은  null 값일때를 꼭 넣어줘야함
        for (Account account : accountList) {
            // for문 사용하면 계속해서 배열만큼 돌기때문에 값이 fasle라면 brake;로 꼭 끊어줘야함
            if (account != null) {
                System.out.println("계좌번호 :" + account.getAccountNumber() + "," + "잔액 :" + account.getBalance());

            } else {
                break;
            }
        }


    }

    public void deposit(String accountNumber, double amount) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 입금 금액 만큼 잔액을 추가한다.
        Account account = findAccount(accountNumber);

        if (account == null) {
            System.out.println("동작하지 않습니다.");
        } else {
            account.deposit(amount);

        }



        // 단, Account 클래스의 deposit 메서드를 사용하여야 한다.


    }

    public void withdraw(String accountNumber, double amount) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 출금 금액만큼 잔액을 차감시킨다.
        // 단, findAccount 메서드를 이용하여 찾는다. 0
        // 단, Account 클래스의 withdraw 메서드를 사용하여 잔액을 차감해야 한다

       Account account = findAccount(accountNumber);

       if (account != null) {
           account.withdraw(amount);
       } else {
           System.out.println("출금할 잔액이 부족합니다.");
       }



    }

    private Account findAccount(String accountNumber) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾아서 리턴하는 메서드 작성
        for (Account account : accountList) {
            if (account != null && account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void run() {
        while (true) {
            // ux 기능 출력
            System.out.println("\n=== 계좌 관리 프로그램 ===");
            System.out.println("1. 계좌 추가");
            System.out.println("2. 계좌 목록 조회");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("0. 종료");
            System.out.print("원하는 기능을 선택하세요: ");

            // 메뉴 번호를 받는 것
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("잔액: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    addAccount(accountNumber, balance);
                    break;
                case 2:
                    showAccountList();
                    break;
                case 3:
                    System.out.print("계좌번호: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("입금액: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    deposit(accountNumber, depositAmount);
                    break;
                case 4:
                    System.out.print("계좌번호: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("출금액: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    withdraw(accountNumber, withdrawAmount);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}
