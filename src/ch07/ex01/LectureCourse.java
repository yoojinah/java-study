package ch07.ex01;

public class LectureCourse extends Course{
    public String room; // 강의실
    public int time; // 강의 시간

    public LectureCourse(String courseName, int courseCode, String instructor, String room, int time) {
        super(courseName, courseCode, instructor);
        this.room = room;
        this.time = time;
    }

    public String getRoom() {
        return this.room;
    }

    public int getTime() {
        return this.time;
    }
}
