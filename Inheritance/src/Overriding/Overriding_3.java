package Overriding;

class AA {
    void print1() {
        System.out.println("AA클래스 print1");
    }
    void print2() {
        System.out.println("AA클래스 print2");
    }
}
class BB extends AA {
    @Override
    void print1() {
        System.out.println("BB클래스 print1");
    }
    void print2(int a) {
        System.out.println("BB클래스 print2");
    }
}

// 오버라이딩과 오버로딩의 비교
public class Overriding_3 {
    public static void main(String[] args) {

    }
}
