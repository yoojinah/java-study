package com.myuniversity.course;

// 다른 패키지에 있는 클래스를 가져다 쓰는 방법 (자동으로 import해서 완성됨)
// import 패키지명...클래스명;
// import 패키지명...*; ---> 해당 패키지의 모튼 클래스를 불러온다
import com.myuniversity.students.Student;

public class Course {


    private String name;  // 과목이름
    private Student[] students;  // 학생 수 배열
    private int numOfStudents = 0; // 현재 과목에 몇명의 학생이 있는지? -----> 0으로 초기화
    private int maxStudent = 20;  // 총 학생 수 ↓ (final 변수를 쓰게 되면)

    // private final int MAX_STUDENT = 20; (총 학생 수를 20명으로 고정)
    // final 변수
    // 상수 : 초기화만 가능하고, 변경 불가능한 값
    // 상수는 대문자_로 사용한다(관례)



//    private GraduatrStudent[] graduatrStudents;
//    private UndergraduerateStudent[] undergraduerateStudents;

    public Course(String name, int maxStudent ) {
        this.name = name;
        this.maxStudent = maxStudent;
        this.students = new Student[maxStudent];

    }



    // 해당 코스에 학생을 추가
    public void joinStudent(Student student) {
        this.students[numOfStudents] = student;
        this.numOfStudents++;

    }

    public void joinCreate(Course name) {
        this.name += name;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }
}
