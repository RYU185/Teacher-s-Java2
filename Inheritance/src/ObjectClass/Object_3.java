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

    }
}
