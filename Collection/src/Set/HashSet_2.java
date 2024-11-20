package Set;

import java.util.Objects;

// A클래스는 equals와 hashcode를 오버라이드하지 않음
class A {
    int data;
    public A(int data) {
        this.data = data;
    }
}
// B클래스는 equals만 오버라이드
class B {
    int data;
    public B(int data) {
        this.data = data;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof B) {
            this.data = ((B) obj).data;
            return true;
        }else {
            return false;
        }
    }
}
// C클래스는 equals와 hashcode를 모두 오버라이드함
class C {
    int data;
    public C(int data) {
        this.data = data;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof C) {
            this.data = ((C) obj).data;
            return true;
        }else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}

public class HashSet_2 {
    public static void main(String[] args) {

    }
}
