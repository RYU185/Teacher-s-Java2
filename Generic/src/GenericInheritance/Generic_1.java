package GenericInheritance;

class Parent<T> {
    T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
// 제네릭클래스를 상속한 자식클래스도 제네릭클래스임!!
// 부모의 제네릭타입 변수를 그대로 물려받음
class Child<T> extends Parent<T> {}


public class Generic_1 {
}
