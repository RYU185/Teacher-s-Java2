package GenericBound;

class A3 {}
class B3 extends A3 {}
class C3 extends B3 {}
class D3 extends C3 {}
class Goods<T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}

public class GenericBound_3 {
}
