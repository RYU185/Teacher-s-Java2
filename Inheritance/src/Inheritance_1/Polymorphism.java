package Inheritance_1;

// 단순한 상속관계
class A {}
class B extends A {}
class C extends B {}
class D extends B {}

// 다형성
public class Polymorphism {
    public static void main(String[] args) {
        // A
        A a1 = new A();
        A a2 = new B(); // 업캐스팅 B는 A이다
        A a3 = new C(); // 업캐스팅 C는 A이다
        A a4 = new D(); // 업캐스팅 D는 A이다
        // B
        // B b1 = new A(); // 에러 다운캐스팅 : A는 B이다(X) - 잘못된 명제!
        B b2 = new B();
        B b3 = new C();
        B b4 = new D();
    }
}









