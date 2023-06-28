package ch09;

import java.util.LinkedList;

// 큐(Queue) : FIFO(First In First Out)
// 가장 먼저 들어간 것이 가장 먼저 처리됨
// ex) 메세지 처리 시스템으로 많이 사용
// 넣을 때 en / 뺄 때 de
public class GenericQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    // 요소 추가
    // 가장 마지막 위치에 넣음
    // --------------------
    // .............3 2 1
    // --------------------
    public void enqueue(T item) {
        queue.addLast(item);
    }



    public T dequeue() {
        return queue.removeFirst();
    }
}
