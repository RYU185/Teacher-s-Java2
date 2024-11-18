package GenericBound;

class A2 {
    public <T extends Number> void method1(T t) {
        System.out.println(t.intValue());
    }
}

public class GenericBound_2 {
}
