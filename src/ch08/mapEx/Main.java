package ch08.mapEx;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();

        students.put(1,new Student("jin ah",28));
        students.put(2,new Student("gil dong",25));
        students.put(3,new Student("dong hae", 33));
        students.put(4,new Student("won ho", 24));
        students.put(5,new Student("ho jin", 16));


        int studentId = 3;
        Student student = students.get(studentId);
        System.out.println("이름은 : "+ student.getName() + "나이는 : "+student.getAge());


        students.remove(1);
        System.out.println(students);


        for (Map.Entry<Integer,Student> entry : students.entrySet()) {
            int studentIdd = entry.getKey();
            Student student1 = entry.getValue();
            System.out.println(studentIdd + "나이는 : " +student1.getName() + "나이는 : "+ student1.getAge());
        }


        // 평균 나이 계산
        int resetAge = 0;
        for (Student student1 : students.values()) {
            if (student1.getAge() >= resetAge){
                resetAge += student1.getAge();
            }
        }
        double totalAge = (double) resetAge / students.size();
        System.out.println("학생들의 평균 나이는 : " + totalAge);


        Student oldAge = null;
        for (Student studentAge : students.values()) {
            if (oldAge == null || studentAge.getAge() > oldAge.getAge() ) {
                oldAge = studentAge;
            }
        }

        if (oldAge != null) {
            System.out.println("가장 나이가 많은 학생의 나이는" + oldAge.getAge());
        } else {
            System.out.println("학생 정보 없음");
        }


        int minAge = Integer.MAX_VALUE;
        for (Student student2 : students.values()) {
            if (student2.getAge() <= minAge) {
                minAge = student2.getAge();
            }
        }
        System.out.println("가장 어린 학생의 나이는 : " + minAge);

    }
}
