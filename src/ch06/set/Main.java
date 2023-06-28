package ch06.set;

import com.myuniversity.students.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("유진아",12);
        Student s2 = new Student("홍길동",12);
        Student s3 = s1;

        // hashCode : 같은 참조면 값은 값
        System.out.println("s1: " + s1.hashCode());
        System.out.println("s2: " + s2.hashCode());
        System.out.println("s3: " + s3.hashCode());

        // equals : 기본적으로 같은 참조면 true이나 바꿀 수 있음
        System.out.println(s1.equals(s3));

        // 객체 추가
        Set<String> sets = new HashSet<>();
        sets.add("apple");
        sets.add("banana");
        sets.add("cherry");
        sets.add("durian");
        sets.add("elderberry");

        // 객체 탐색/조회
        for (String fruit : sets) {
            System.out.println(fruit);
        }

        // contains (해당 값 조회)
        System.out.println(sets.contains("cherry"));

        // remove 값 삭제
        System.out.println(sets.remove("cherry"));
        System.out.println(sets);

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("durian");
        list.add("elderberry");
        list.add("durian");
        System.out.println("-----------------------");

        for (String fruitList : list) {
            System.out.println(fruitList);
        }

        // 중복제거(Set<> = new HashSet)
        System.out.println("-----------중복제거(Set<> = new HashSet)------------");
        Set<String> set2 = new HashSet<>(list);
        for (String s : set2) {
            System.out.println(s);
        }

        System.out.println("-----------중복제거 및 정렬 new TreeSet<>------------");

        for (String s :new TreeSet<>(list)) {
            System.out.println(s);
        }
        System.out.println("-----------------------");




    }
}
