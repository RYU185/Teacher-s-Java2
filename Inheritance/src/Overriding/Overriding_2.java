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
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.cry();
        bird.cry();
        cat.cry();
        dog.cry();
        System.out.println();
        Animal animal1 = new Bird(); // 업캐스팅
        Animal animal2 = new Cat(); // 업캐스팅
        Animal animal3 = new Dog(); // 업캐스팅
        animal1.cry();
        animal2.cry();
        animal3.cry();
        System.out.println();
    }
}







