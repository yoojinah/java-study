package ex;

public class Student {
    private String name;
    private int studentId;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    public Student(String name, int studentId){
        this.name = name;
        this.studentId = studentId;
    }

    public void setScore(int koreanScore, int englishScore, int mathScore) {
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public int calculateTotalScore(){
        return koreanScore + englishScore + mathScore;
    }

    public double calculateAverageScore() {
        return calculateTotalScore() / 3.0;
    }
}
