package ex;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 :");
        String name = scanner.nextLine();


        System.out.print("학번 :");
        int studentId = scanner.nextInt();

        System.out.print("국어 점수 :");
        int koreanScore = scanner.nextInt();

        System.out.print("영어 점수 :");
        int englishScore = scanner.nextInt();

        System.out.print("수학 점수 :");
        int mathScore = scanner.nextInt();

        Student student = new Student(name, studentId);

        student.setScore(koreanScore,englishScore,mathScore);
        System.out.println("총점 : "+student.calculateTotalScore());
        System.out.println("평균점수 :"+student.calculateAverageScore());

        scanner.close();

    }
}
