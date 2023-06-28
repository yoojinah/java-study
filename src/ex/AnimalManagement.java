package ex;

import java.util.Scanner;

public class AnimalManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("강아지 이름 :");
        String name = scanner.nextLine();

        System.out.print("강아지 나이 :");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("강아지 견종 :");
        String breed = scanner.nextLine();

        Dog animal = new Dog(name,age,breed);


        System.out.println(animal.getName()+" "+animal.getAge()+ " " + animal.getBreed());





    }
}
