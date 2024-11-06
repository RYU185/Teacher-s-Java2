package Overriding;

class AA {
    void print1() {}
    void print2() {}
}
class BB extends AA {
    @Override
    void print1() {}
    void print2(int a) {}
}

// 오버라이딩과 오버로딩의 비교
public class Overriding_3 {
    public static void main(String[] args) {

    }
}
