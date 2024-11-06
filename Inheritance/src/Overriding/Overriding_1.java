package Overriding;

class A {
    int a = 5;
    void print() {
        System.out.println("A 클래스 " + a);
    }
}
class B extends A {
    int a = 10;
    void print() {
        System.out.println("B 클래스 " + a);
    }
}

public class Overriding_1 {
    public static void main(String[] args) {

    }
}
