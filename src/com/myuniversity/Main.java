package com.myuniversity;

import com.myuniversity.students.Student;
import com.myuniversity.course.Course;
import com.myuniversity.course.CourseService;

public class Main {
    public static void main(String[] args) {
        Course c = new Course("자바",20);


        Student d = new Student("홍길동",20);

        System.out.println("----------------");

        CourseService courseService = new CourseService(2);
        courseService.run();





    }
}
