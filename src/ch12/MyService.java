package ch12;

public class MyService extends Thread {
    private String name;
    public MyService(String name) {
        this.name = name;
    }

    // Thread 클래스를 상속받고 run()메서드를 구현
    // run() 메서드가 실행될 때 추가적인 스레드가 생성
    // 출력 횟수 및 일시정지 시간을 랜덤으로 처리함
    // 주석 또 추가함


    // 60회 출력하고 1초(1000ms)마다 멈춘다.

    @Override
    public void run(){
        for (int i = 1; i <= (int) (Math.random() * 1000); i++){
            System.out.println("스레드 "+ name + ": " + i);
            try {
                Thread.sleep ((int) (Math.random() * 1000)); // 스레드로 일시정지 해주는 것
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
