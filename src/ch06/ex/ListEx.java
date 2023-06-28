package ch06.ex;

import java.util.ArrayList;
import java.util.List;
public class ListEx {
    public static void main(String[] args) {
        List<String> fruitList;

        fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("cherry");
        System.out.println(fruitList.size());
        System.out.println("----------------------");
        System.out.println();


        System.out.println(fruitList.get(1));
        System.out.println("----------------------");
        System.out.println();


        fruitList.remove(1);
        System.out.println(fruitList);
        System.out.println("----------------------");
        System.out.println();



        fruitList.add("strawberry");
        fruitList.add(1,"orange");
        System.out.println(fruitList);
        System.out.println("----------------------");
        System.out.println();


        boolean fruitEmpty = fruitList == null || fruitList.isEmpty();
        if (fruitEmpty) {
            System.out.println("배열에 요소가 존재하지 않습니다");
        } else {
            for (String fruit : fruitList) {
                fruitEmpty = false;
                System.out.println(fruit);
            }
        }
        System.out.println("----------------------");
        System.out.println();



        String longString = "";
        for (String fruit : fruitList) {
            if (fruit.length() > longString.length()) {
                longString = fruit;

            }

        }
        System.out.println("가장 긴 과일 이름은 : " + longString);
        System.out.println("----------------------");
        System.out.println();


        String shortString = null;
        for (String fruit : fruitList) {
            if (fruit != null && (shortString== null || fruit.length() < shortString.length())) {
                shortString = fruit;
            }
        }
        System.out.println("가장 짧은 과일 이름은 : " + shortString);
        System.out.println("----------------------");
        System.out.println();

        boolean cherryHere = false;
        for (String fruit : fruitList) {
            if (fruit.equals("cherry")) {
                cherryHere = true;
                break;
            }
        }
        if (cherryHere) {
            System.out.println("체리 있음");
        } else {
            System.out.println("체리 없음");
        }
        System.out.println("----------------------");
        System.out.println();




        fruitList.remove(fruitList.size() - 1);
        System.out.println(fruitList);

















    }






}
