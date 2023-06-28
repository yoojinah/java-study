package ch08.student;

import ch04.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<Integer> scores = new ArrayList<>();

    private ArrayList<Integer> list = new ArrayList<>();

    public Student(String name, int studentId, List<Integer> scores) {
        this.name = name;
        this.studentId = studentId;
        this.scores = scores;
    }

    public int getTotalScore() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    public double getAverageScore() {
        int total = getTotalScore();
        double average = (double) total / scores.size();
        return average;
    }

    public int sum(int a, int b) {
        return a+ b;
    }

    public int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


    public int totalMax() {
        int sss = 0;
        for (Integer totalList : list) {
            sss += totalList;
        }
        return sss;
    }


    public static void main(String[] args) {
        Student ss = new Student("진아",1234, Arrays.asList());
        ss.list.add(123);
        ss.list.add(566544);

        int result = ss.totalMax();
        System.out.println(result);
        System.out.println(123+566544);

    }



}
