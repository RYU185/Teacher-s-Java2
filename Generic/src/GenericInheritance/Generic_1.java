package GenericInheritance;

class Parent<T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
class Child<T> extends Parent<T> {}

public class Generic_1 {
}
