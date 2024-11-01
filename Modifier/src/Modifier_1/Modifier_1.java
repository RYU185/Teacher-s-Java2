package Modifier_1;

import Modifier_1.pack1.A;
import Modifier_1.pack1.B;

public class Modifier_1 {
    public static void main(String[] args) {
        A a = new A();
        a.print(); // 1 2 3 4
        B b = new B();
        b.print(); // 1 2 3
    }
}
