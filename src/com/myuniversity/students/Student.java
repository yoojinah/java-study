
package com.myuniversity.students;

// comparable 인터페이스를 구현하면 된다
//  자바 객체를 특정 필드로 정렬하는 방법(chat gpt)
public class Student implements Comparable<Student> {


    String studentName; // 학생 이름
    int age;

    public Student(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    public void assignCourse(String addStudents) {
        this.studentName += addStudents;
    }


    public String getStudentName() {
        return studentName;
    }

    public String toString(){
        return studentName;
    }
    public int getAge() {
        return this.age;
    }

    public int compareTo(Student o) {
        return this.studentName.compareTo(o.studentName);

    }

}
