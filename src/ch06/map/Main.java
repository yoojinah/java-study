package ch06.map;

import ch06.list.account.Account;
import com.myuniversity.students.Student;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        Map<String, Account> accounts = new HashMap<>();

        accounts.put("01", new Account("1111-01-1111",10));
        accounts.put("02", new Account("2222-02-2222",20));


        // 객체 추가
        // 키(key)   : 유일한 값, --> 학번으로 한 상태
        // 값(value) : 학생정보
        // 맵변수.put(앤트리(k,v))
        // 엔지니어반에- 01번학생-총십만명의학생이 있다
        students.put("e-01-00001", new Student("강애진", 20));
        students.put("e-01-00002", new Student("김소현", 20));
        students.put("e-01-00003", new Student("유진아", 20));
        students.put("e-01-00004", new Student("홍길동", 20));

        // 객체 검색/ 조회
        // keySet() : 키 목록을 반환함(키는 중복이 안됨)
        // Set : 집합, 중복이 없는 자료구조를 말함
        // 자료구조는 정렬해서 저장하지 않음

        // 배열을 순서대로 정렬해서 뽑는 방법 (TreeMap 이용)
        Map<String, Student> listStudents = new TreeMap<>(students);
        for (String key: listStudents.keySet()) {
            // 맵변수.get(키값)  --> 값 객체
            System.out.println("학번 : " + key + " " + "학생명 : "  + students.get(key).getStudentName());
        }

        // 객체 문자열로 있는 지 확인하는 법
        boolean result = students.containsKey("01-000-111");
        System.out.println(result);




//        // value값을 받고 싶을 때
//        for (Student value: students.values()) {
//            System.out.println(value.getStudentName());
//        }


//        // 해시맵을 정렬된 트리맵으로 변환할 수 있는 법
//            Map<String, Student> listStudents = new TreeMap<>(students);

        // 객체값 수정
        // 앱변수.get(키값) : 키값으로 조회 후 뭔가를 처리할 수 있음
        // setter 생성해서 값 수정
        Student s = students.get("e-01-0002");

        // 객체 수정
        // 맵변수.remove(키값) : 특정 키값의 앤트리(key-value)를 삭제
        students.remove("e-01-00002");
        // 모든 값을 밀어라 (삭제)
        students.clear();
        System.out.println(students);


    }
}
