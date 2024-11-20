package Set;
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

public class HashSet_2 {
    public static void main(String[] args) {

    }
}
