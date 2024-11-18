package GenericBound;

class A {}
class B extends A {}
class C extends B {}

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
