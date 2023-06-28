package ch06.list;

import com.myuniversity.students.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class List {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        java.util.List<Student> lstStudent = new ArrayList<Student>();
        lstStudent.add(new Student("진아",12));
        lstStudent.add(new Student("길동",15));
        lstStudent.add(new Student("둘리",20));

        Collections.reverse(lstStudent);

        for (Student nameList : lstStudent) {
            System.out.println(nameList.getStudentName());
        }
        System.out.println();

        System.out.println("1. --------------------");

        // 클래스명 ::필드명(getter)
        // 해당 클래스의 필드로 뭔가를 하겠다  --> ::
        // Collections.sort(생성한 객체이름, Comparator.comparing(클래스명::getter));
        Collections.sort(lstStudent, Comparator.comparing(Student::getStudentName));
        for (Student name : lstStudent) {
            System.out.println(name.getStudentName());
        }



        System.out.println("2. ---------------------");
        list.add("사과");
        list.add("바나나");
        list.add("체리");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        System.out.println(list);

        System.out.println("3. -----------------");

        System.out.println(list.size());




        System.out.println("4. --------------------");
        // list.get(1);  // 해당 인덱스 번호 호출
        list.get(1);
        System.out.println(list.get(1));




        System.out.println("5. -------------------");
        list.remove(1);
        System.out.println(list);




        System.out.println("6. -----------------");
        list.add("딸기");
        list.add(2,"오렌지");
        System.out.println(list);




        System.out.println("7. ---------------");
        boolean isEmptys = list == null || list.isEmpty();

        for (String fruit : list) {
            if (isEmptys) {
                System.out.println("값이 없습니다.");
            } else {
                System.out.println(fruit);
            }
        }


        System.out.println("8. --------------------");
        // 문자열이 비어있는지 확인하려면 아예 null이거나 문자열의 길이가 0이거나를 충족하는 boolean 함수
        boolean isEmpty = list == null || list.isEmpty();
        if (isEmpty) {
            System.out.println("리스트가 비어있습니다.");
        } else {
            for (String fruit : list) {
                System.out.println("과일 : " + fruit);
            }
        }




        System.out.println("10. ------------------");
        String longString = "";
        for (String fruit : list) {
            if (longString.length() < fruit.length()) {
                longString = fruit;
            }

        }
        System.out.println("가장 긴 문자열은" + longString);







        System.out.println("11. -----------------------------");
        String shortString = null; // 가장 짧은 문자열을 찾을땐 null값을 가지는 변수를 처음에 만듬
        for (String fruit : list) {
            if (shortString == null|| shortString.length() > fruit.length()) {
                shortString = fruit;
            }
        }
        System.out.println("가장 짧은 문자열은 : " + shortString);









        System.out.println("14. -------------------");
        boolean cherryFind = false;
        for (String fruit : list) {
            if (fruit.equals("체리")) {
                cherryFind = true;
                System.out.println(fruit);
                break;
            }
        }
        if (!cherryFind) {
            System.out.println("체리 없음");
        }





//        boolean cherryFind = false;
//        for (String fruit : list) {
//            if (fruit.equals("체리")) {
//                System.out.println(fruit);
//                cherryFind = true;
//                break;
//            }
//        }
//        if (!cherryFind) {
//            System.out.println("과일중 체리는 없습니다.");
//        }



        System.out.println("15. ---------------------");
        list.remove(3);
        for (String fruit : list) {
            System.out.println(fruit);
        }







    }
}
