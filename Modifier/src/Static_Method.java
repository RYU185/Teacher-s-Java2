public class Static_Method {
    public static void main(String[] args) {
        // 인스턴스 메서드는 객체생성(인스턴스화)후에만 사용가능
        A a1 = new A();
        a1.abc(); // 10 20

        // 정적 메서드 사용
        // #1
        A.bcd();
    }
}

class A {
    int a; // 인스턴스 필드
    static int b; // 정적 필드
    void abc() { // 인스턴스 메서드
        a = 10;
        b = 20;
        System.out.println(a + " " + b);
    }
    static void bcd() { // 정적(static) 메서드
        b = 20;
        System.out.println(b);
    }
}







