package ch06.map;

import ch04.Array;
import ch06.map.student.Student;

import java.util.*;

public class MapExx {
    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();


        students.put(01, new Student("aisad", 13));
        students.put(02, new Student("csd", 10));
        students.put(03, new Student("detw", 25));
        students.put(04, new Student("reww", 33));
        students.put(05, new Student("bwsf", 25));

        students.remove(01);

        List<Student> std = new ArrayList<>(students.values());

        std.sort(Comparator.comparing(Student::getAge)); // 나이로 정렬하는 실행문
        for (Student student : std) {
            System.out.println("이름은 : " + student.getName() + ", 나이는 : " + student.getAge());
        }
        // std 정렬 됨
        System.out.println("-------------------------");
        std.sort(Comparator.comparing(Student::getName)); // 이름으로 정렬하는 실행문
        for (Student student : std) {
            System.out.println("이름은 : " + student.getName() + ", 나이는 : " + student.getAge());
        }


        Map<Integer, Student> listStudent = new TreeMap<>(students);
        for (Integer student : listStudent.keySet()) {
            System.out.println("학번 : "+ student + "학생 이름:" + students.get(student).getName() + "학생 나이는 : " + students.get(student).getAge());
        }

        System.out.println("--------------------------------");

        Map<Integer, Student> orderStudent = new TreeMap<>(students);
        for (Student student : orderStudent.values()) {
            System.out.println(student.getName());
        }

        System.out.println("----------------------------------");
        List<Student> totalStudent = new ArrayList<>(students.values());
        totalStudent.sort(Comparator.comparing(Student::getName));
        for (Student student : totalStudent) {
            System.out.println("이름:"+student.getName()+"나이:"+student.getAge());
        }
        System.out.println("---------------------------------");



        List<Integer> integerList = new ArrayList<>();
        integerList.add(20);
        integerList.add(34);
        integerList.add(78);

        int totalIntList = 0;
        for (Integer intger : integerList) {
            totalIntList += intger;
        }
        double everageList = (double) totalIntList / integerList.size();
        System.out.println(everageList);
        System.out.println((20.0+34.0+78.0) / integerList.size());

        System.out.println("------------------------------");


        // 리스트 배열을 생성하고 이름값을 정렬한다
        // 리스트에 있는 학생이름과 나이를 프린트(이름값은 순차적으로 정렬해서)
        List<Student> ss = new ArrayList<>(students.values());
        ss.sort(Comparator.comparing(Student::getName));
        for (Student student : ss) {
            System.out.println("학생이름 : " + student.getName()+"학생 나이 :" + student.getAge());
        }

        // 알파벳 순서대로 배열 정렬하는 법
        ss.sort(Comparator.comparing(student -> student.getName()));
        for (Student student : ss) {
            System.out.println(student.getName());
        }













    }
}
