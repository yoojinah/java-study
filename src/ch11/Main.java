package ch11;

public class Main {
    public static void main(String[] args) {
        try {
            int tera = 0; // 0이되는 케이스는 주로 입력값을 못받은 상태
            int amount = 240;
            int result = amount / tera;
            System.out.println("한달에 " + result + "만원");
        } catch (ArithmeticException e) { // 특정 예외사항 (구체적인 에러를 토해낼때는 catch문을 맨앞에 써줘야함)
            System.out.println("산술연산 예외발생" +e.getMessage());
            System.out.println("나누기 연산값을 정확히 입력해 주세요.");
        } catch(Exception e) {  // 일반적인 예외 상황이되 예외처리를 너무 남발하지 말 것
            System.out.println(e.getMessage());
        }


    }
}
