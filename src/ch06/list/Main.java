package ch06.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List<자료형> 변수명 = new ArrayList<자료형>();
        // 자료형에 따라 다르게 작동하기 위해 추가적인 매개변수를 <자료형을> 넣는다.
        // 자료형을 매개변수로 받는 것을 제네릭/쥐네릭(generic)
        // 매개변수의 자료형은 기본(원시) 자료형은 안됨
        // int, long ...은 안됨 (Integer, Long로 넣어야 함)
        List<String> list = new ArrayList<String>();
//        List<String> list = new LinkedList<String>();

        List<Integer> listInteger = new ArrayList<Integer>();

        // 객체 추가
        // list 변수.add(객체);
        list.add("유진아");
        list.add("홍길동");
        for (String name : list) {
            System.out.println(name);
        }

        // 특정 위치값을 변경할떄는
        // list.변수(set(인덱스 넘버, "값"))
        list.set(0, "조정빈");
        list.set(1, "이현미");
        for (String name : list) {
            System.out.println(name);
        }

        // list.size() : 요소의 개수

        list.size();
        System.out.println("---------------------");
        list.add("김성우");
        list.add("김소현");
        for (String name : list){
            System.out.println(name);
        }

        System.out.println("----------------------");
        // 1번 요소 삭제
        list.remove(1);
        // 뒤에 있는 것을 전부 당겨옴 중간에 구멍(null)이 안 생김
        for (String name : list){
            System.out.println(name);
        }

        System.out.println("----------------------");
        // 2번에 객체 삽입
        list.add(2, new String("이현미"));
        for (String name : list) {
            System.out.println(name);
        }
        // 이렇게 중간에 요소를 삭제하거나 추가하면
        // 뒤쪽 요소를 당겨오거나 밀어내야하는 overhead(추가적인 연산) 발생
        // 이런 케이스가 잦다면?   ArrayList --> LinkedList
        //                 요소추가       전체 탐색        요소삭제/삽입
        // ArrayList        빠름           빠름            느림(많이)
        // LinkedList       느림           느림              빠름


    }
}
