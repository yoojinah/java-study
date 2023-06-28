package ch07.ex01;

public class Course {
    private String courseName; // 과목 이름
    private int courseCode; // 과목 코드
    private String instructor; // 강사 이름

    public Course(String courseName, int courseCode, String instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }



    public String getCourseName(){
        return this.courseName;
    }

    public int getCourseCode() {
        return this.courseCode;
    }

    public String getInstructor() {
        return this.instructor;

    }





}
