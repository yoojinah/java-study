package ch09;

import ch05.Student;
import ch08.ex02.Account;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // <String>
        // List : 인터페이스, ArrayList : 구현클래스
        // <String> : 매개변수 타입(클래스)으로 넣음
        // List 인터페이스는 다양한 타입의 객체를 저장할 수 있음
        // 매개변수를 타입으로 넣을 수 있게 하는 것이 제네릭
        // List를 타입 변환을 할 수 있는 이유는 List가 제네릭으로 돼 있기 때문
        // 제네릭을 쓸 수 있는 상황은 연산이나 로직이 같을 때
        // 메스드명, 매개변수도 같은데 타입만 다를 경우에


        // 장점
        // 1. 타입 안정성을 높힐 수 있음
        // 2. 타입을 컴파일 타임(코드 짜는중)을 체크할 수 있음
        // 3. 기능을 타입(클래스)별로 만들지 않아도 됨
        // 4. 코드를 매개변수 타입으로 쉽게 재사용이 가능함
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add(new String("132"));

        List<Integer> listNum = new ArrayList<>();
        listNum.add(1);
        listNum.add(2);

        GenericStack<String> stack = new GenericStack<>();
        GenericStack<Integer> stackInteger = new GenericStack<>();
        GenericStack<Student> stackStudent = new GenericStack<>();
        GenericStack<Account> stackAccount = new GenericStack<>();


        GenericQueue<Integer> queueInt = new GenericQueue<>();
        queueInt.enqueue(1);
        queueInt.enqueue(2);
        queueInt.enqueue(3);

        System.out.println(queueInt.dequeue());
        System.out.println(queueInt.dequeue());
        System.out.println(queueInt.dequeue());

        System.out.println("----------------------");





//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(5);
//        numbers.add(3);
//        numbers.add(3);
//        numbers.add(3);
//
//        // 특정 값이 몇개 있는 지 확인
//        int target = 3;
//        int occuCount = occurrenceCount(numbers, target);
//        System.out.println("비교할 숫자는"+target + " " + "배열 안에서 해당 숫자의 갯수는" + occuCount);
//
//
//
//
////
////        String findFruit = "apple";
////        String findFruitList =  findFruits(fruitList, findFruit);
////        System.out.println(findFruit+findFruitList);
//
//
//        List<String> fruitList = new ArrayList<>();
//        fruitList.add("apple");
//        fruitList.add("banana");
//        fruitList.add("cherry");
//        fruitList.add("apple");
//        fruitList.add("melon");
//        fruitList.add("durian");
//
//        String targetName = "apple";
//        int occurrenceCount  = countOccurrences(fruitList, targetName);
//        System.out.println("과일 이름은 : "+targetName + " " + "중복된 갯수는 : " + occurrenceCount);
//
//
//    }
//
//
//
//    public static <T> int occurrenceCount(List<T> list, T target) {
//         int count = 0;
//         for (T lists : list) {
//             if (lists.equals(target)) {
//                 count ++;
//             }
//         }
//         return count;
//    }
//
//    public static <T> int countOccurrences(List<T> fruitList, T targetName) {
//        int count = 0;
//        for (T item : fruitList) {
//            if (item.equals(targetName)) {
//                count++;
//
//            }
//        }
//        return count;




    }




}
