package GenericBound;

class A {}
class B extends A {}
class C extends B {}
// 제네릭타입 T의 범위를 제한하는 방법
// T는 B를 상속하기때문에 T 자리에 B와 B의 자식클래스(C)만 올 수 있음!!
class D <T extends B> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}

public class GenericBound_1 {
}
