package GenericBound;

class A2 {
    public <T extends Number> void method1(T t) {
        System.out.println(t.intValue());
    }
}
interface MyInterface {
    public abstract void print();
}
class B2 {
    public <T extends MyInterface> void method1(T t) {
        t.print();
    }
}

public class GenericBound_2 {
}



