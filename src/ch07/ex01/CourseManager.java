package ch07.ex01;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    List<Course> courses;



    public CourseManager() {
        courses = new ArrayList<>();

    }

    public void addCourse(Course course) {
        courses.add(course);
    }


    public void printCourse() {
        for (Course print : courses) {
            System.out.println(print);
        }

    }

    // getCourseByInstructor: 특정 강사가 강의하는 Course 객체를 반환하는 메서드
    // (단, 한 명의 강사가 여러 개의 강의를 할 수 있음)
    public List<Course> getCourseByInstructor(String instructorName) {
        List<Course> instructorList = new ArrayList<>();
        for (Course course : courses) {
            if (course.getInstructor().equals(instructorName)) {
                instructorList.add(course);
            }
        }
        return instructorList;
    }

//    public OnlineCourse getOnlineCourses() {
//        List<OnlineCourse> ss = new ArrayList<>();
//        int index = 0;
//
//        for (OnlineCourse course : ss) {
//            if (Course instanceof OnlineCourse) {
//
//            }
//        }
//        return ;
//    }


}
