class A2 {
    int a = 3;
    int b = 4;
    void abc() {
        System.out.println("A클래스 메서드");
    }
    class B2 {
        int a = 5;
        int b = 6;
        void abc() {
            System.out.println("B클래스 메서드");
        }
        void bcd() {
            System.out.println(a);
            abc();
        }
    }
}

public class InnerClass_2 {
    public static void main(String[] args) {
        A2 a = new A2();
        A2.B2 b = a.new B2();
        b.bcd();
    }
}
