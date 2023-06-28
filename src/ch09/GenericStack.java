package ch09;

// LinkedList를 이용해서 stack이라는 자료구조를 만들 것
// stack은 LIFO(Last In First Out)
// 가장 나중에 넣은 것이 가장 먼저 처리되는 자료구조
// 접시를 쌓아놓고 설거지하는 것과 비슷한 상황


// ex) 메서드 호출이 stack에 쌓아놓고 호출됨
// a()--> b() --> c() : 실행순서는 c() --> b() --> a()

// ex) 웹 브라우저 뒤로가기 : 가장 나중에 열린 페이지부터 뒤로가기를 실행
// navigationStack : 1->2->3 ... 뒤로가기 실행 3->2->1

import java.util.LinkedList;

public class GenericStack<T> {
    private LinkedList<T> stack = new LinkedList<>();

    //요소 추가
    public void push(T item) {
//        stack.addFirst(item);
        stack.addLast(item);
    }

    // 가장 마지막 요소 1개 꺼내오기
    public T pop(){
//        return stack.removeFirst();
        return stack.removeLast();
    }
}
