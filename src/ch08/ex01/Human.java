package ch08.ex01;

public class Human implements Walkable, Runnable{
    public void walk(){
        System.out.println("The human is walking");
    }

    public void run() {
        System.out.println("The Human is running");
    }
}
