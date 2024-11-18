package GenericMethod;

// 일반클래스안에도 제네릭 메서드 사용 가능!
class MyClass {
    // 제네릭 선언<T> 위치 주의
    public <T> T method1(T t) {
        return t;
    }
    public <T> boolean method2(T t1, T t2) {
        return t1.equals(t2);
    }
    public <K,V> void method3(K k, V v) {
        System.out.println(k + ":" + v);
    }
}

public class GenericMethod_1 {
    public static void main(String[] args) {

    }
}
