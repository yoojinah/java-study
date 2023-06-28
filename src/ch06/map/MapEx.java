package ch06.map;


import com.myuniversity.students.Student;


import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();

        // 5명의 학생 추가
        students.put(01, new Student("홍길동", 12));
        students.put(02, new Student("김철수", 20));
        students.put(03, new Student("김영희", 22));
        students.put(04, new Student("이영수", 45));
        students.put(05, new Student("박경수", 33));

        int searchStudent = 01;
        Student student = students.get(searchStudent);
        System.out.println(student);



        int removeStudents = 03;
        students.remove(removeStudents);


        for ( Map.Entry<Integer, Student> entry : students.entrySet() ) {
            System.out.println("Id : " + entry.getKey() + "학생 이름 : " + entry.getValue().getStudentName() + "나이 : " + entry.getValue().getAge());
        }

        for (Integer key : students.keySet()) {
            System.out.println(students.get(key).getStudentName());
        }

        for (Student name : students.values()) {
            System.out.println(name);
        }


        String studentName = "유진아";
        boolean findName = false;
        for (Student student1 : students.values()) {
            if (student1.getStudentName().equals(studentName)) {
                findName = true;
                break;
            }
        }
        if (findName) {
            System.out.println(studentName + "학생이 있습니다.");
        } else {
            System.out.println(studentName + "학생이 없습니다.");
        }







        int maxAge = 0;
        for (Student age : students.values()) {
            maxAge += age.getAge();
        }
        double average = (double) maxAge / students.size();
        System.out.println("학생들의 평균 나이는 : " + average);



        String thisString = "라";
        for (Student findSting : students.values()) {
            if (findSting.getStudentName().contains(thisString)) {

                break;
            }
        }

        // 클래스에 ArrayList 를 생성한 후 순차적으로 정렬하려면 Collections.sort()로
        // 정렬 시키려는 value() 값을 (지정하고) 생성한 배열을 반복문을 돌려서 정렬한다

        // Collections.sort; 정렬만 된 상태 이렇게 간단하게만 써도 됨
        List<Student> listStudent = new ArrayList<>(students.values());


        // (listStudent, Comparator.comparing(Student::getAge)); 추가되면
        // 반복문을 돌려 값을 출력하려면 이 구문이 필요함
        Collections.sort(listStudent, Comparator.comparing(Student::getAge));
        for (Student student2 : listStudent) {
            System.out.println(student2.getAge());
        }

//        Stream<Map.Entry<String, Student>> sortStudent =
//                students.entrySet().stream().sorted(Map.Entry.comparingByValue());
//        for (Map.Entry<String, Student> std : sortStudent.toList()){
//
//        }





    }

}
