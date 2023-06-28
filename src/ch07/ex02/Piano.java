package ch07.ex02;

public class Piano extends Instrument {
    private String piano;

    public Piano(String piano) {
        super();
        this.piano = piano;
    }

    public void play() {
        super.play();
        System.out.println("피아노는 도레미파솔라");
    }




}
