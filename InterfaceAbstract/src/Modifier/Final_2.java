package Modifier;

class A {
    void abc() {}
    final void bcd() {}
}
class B extends A {
    @Override
    void abc() {
        super.abc();
    }
    @Override
    void bcd() {} //
}

// final 메서드와 final 클래스 예제
public class Final_2 {
}
