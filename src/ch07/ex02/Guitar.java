package ch07.ex02;

public class Guitar extends Instrument {
    private String guitar;



    public Guitar(String guitat) {
        this.guitar = guitat;
    }

    public void play() {
        super.play();
        System.out.println("악기 소리는" + this.guitar);
    }
}
