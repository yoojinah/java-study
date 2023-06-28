package com.myuniversity.course;


import java.util.Scanner;

// 학과 과목과 관련된 기능을 제공해주는 클래스
public class CourseService {




    // 과목 목록 저장하는 배열
    private Course[] coursesList;
    private int numCoureList;
    private Scanner scanner;

    public CourseService(int maxCore) {
        coursesList = new Course[maxCore];
        numCoureList = 0;
        scanner = new Scanner(System.in);
    }



    // 과목 생성기능
    public void createCourse() {

    }

    // 과목에 학생 추가 기능
    public void assignCourse(String addStudents) {

    }


    // 과목에 참여한 학생 출력 기능
    public void showStudentByCourseName(String dee) {

    }






    // run 메서드를 main메서드에서 실행하면 됨
    // 서비스를 실행할 수 있는 run 메서드
    public void run() {
        while (true) {
            System.out.println("1. 학생 추가");
            System.out.println("2. 과목 추가");
            System.out.println("3. 과목에 참여한 학생 수");

            // 추가된 과목 생성 값 받기
            int choice = scanner.nextInt();
            scanner.nextLine();


            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }


            switch (choice) {
                case 1:
                    System.out.println("추가할 학생 이름을 입력하세요");
                    String studentNumber = scanner.nextLine();
                    scanner.nextLine();


                    break;
                case 2:
                    System.out.println("추가할 과목을 입력하세요");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println();


                    break;


            }


        }

    }
}
