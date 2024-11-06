package Overriding;

class Animal {
    void cry() {
        System.out.println("...");
    }
}
// 자식클래스 새, 고양이, 개
class Bird extends Animal {
    void cry() {
        System.out.println("짹짹");
    }
}
class Cat extends Animal {
    void cry() {
        System.out.println("야옹");
    }
}
class Dog extends Animal {
    void cry() {
        System.out.println("멍멍");
    }
}

public class Overriding_2 {
    public static void main(String[] args) {

    }
}
