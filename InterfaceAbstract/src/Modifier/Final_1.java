package Modifier;

class A1 {
    int a = 3;
    final int b = 5;
    A1() {}
}
class A2 {
    int a;
    final int b;
    A2() { a=3; b=5; }
}
class A3 {
    int a = 3;
    final int b = 5;
    A3() { a=5; }

}
class B {
    void bcd() {
        int a = 3;
        final int b = 5;
        a = 7;
    }
}

public class Final_1 {
}
