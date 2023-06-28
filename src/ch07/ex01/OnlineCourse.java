package ch07.ex01;

public class  OnlineCourse extends Course{
    public String platform;

    public OnlineCourse(String courseName, int courseCode, String instructor, String platform) {
        super(courseName, courseCode,instructor);
        this.platform = platform;
    }

    public String getPlatform() {
        return this.platform;
    }



}
