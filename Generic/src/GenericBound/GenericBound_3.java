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
class Test {
    void method1(Goods<A> g) {}
    void method2(Goods<?> g) {}
    void method3(Goods<? extends B> g) {}
    void method4(Goods<? super B> g) {}
}

public class GenericBound_3 {
}
