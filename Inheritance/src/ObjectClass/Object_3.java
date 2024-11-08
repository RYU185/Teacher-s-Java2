package ObjectClass;

class C {
    String name;
    C(){}
    C(String name){ this.name = name; }
}
class D {
    String name;
    D() {}
    D(String name) { this.name = name; }
    @Override
    public boolean equals(Object obj) {
        return this.name == ((D)obj).name ? true : false;
    }
}

public class Object_3 {
    public static void main(String[] args) {
    // Object클래스의 equals메서드와 오버라이드한 메서드의 차이 예제
        C c1 = new C("Hello");
        C c2 = new C("Hello");
        System.out.println(c1 == c2); //
        System.out.println(c1.equals(c2)); //
    }
}






