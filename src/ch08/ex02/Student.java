package ch08.ex02;

public class Student implements Gradable, Studyable{

    private double score;


    public String calculateGrade() {
        if (score >= 90.0) {
            return "a";
        } else if (score >= 80.0) {
            return "b";
        }else {
            return "f";
        }
    }

    public void study(){
        System.out.println("학생은 공부를 하고 있습니다.");
    }



    public static void main(String[] args) {
        Student s = new Student();
        s.score = 30;
        s.calculateGrade();
        System.out.println("학생 점수는 : "+s.calculateGrade());
    }
}
