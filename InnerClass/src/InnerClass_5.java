interface A {
    public abstract void abc(); // 추상메서드
}
class B implements A {
    @Override
    public void abc() {
        System.out.println("오버라이드");
    }
}
class C {
    void method(A a) {
        a.abc();
    }
}

public class InnerClass_5 {
    public static void main(String[] args) {

    }
}
