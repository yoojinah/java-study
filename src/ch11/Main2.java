package ch11;

public class Main2 {
    public static void main(String[] args) {
        try {
            divide(10,2);
        } catch (Exception e) {
            System.out.println("산술 연산의 오류가 발생했습니다."+e.getMessage());
        } finally {
            // 정상적인 접근과 예외처리 상황 모두 실행되는 코드블럭
            // 너무 구체적인 메세지 x (실행이 완료되었습니다 정도로만)
            System.out.println("연산이 실행되었습니다.");
        }


        try {
            test1();
            System.out.println("(4)");
        } catch (Exception e) {
            System.out.println("(5)");
        }

    }


    // 메서드 throws 예외종류
    public static int divide(int a, int b) throws ArithmeticException, IllegalAccessError {
        int result = 0;
        result = a / b;

        return result;
    }

    public static void test1() throws Exception{
        try {
            test2();
            System.out.println("(1)");
        } catch (NullPointerException e) {
            System.out.println("(2)");
        } finally {
            System.out.println("(3)");
        }
    }

    public static void test2() throws Exception{
        throw new NullPointerException();
    }
}
