package ch09;

// 임시저장소(좀 빠른 임시 저장소)
// 일반 RDBMS는 좀 느린데 응답성능이 한 10ms
// 캐시 저장소는 응답성능이 1ms
public class Cache<T> {
    private T data;

    public void setData(T item) {
        this.data = data;
    }



    public T getData() {
        return data;
    }
}
