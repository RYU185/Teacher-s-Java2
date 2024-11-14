class A1 {
    public int a = 3;
    protected int b = 4;
    int c = 5;
    private int d = 6;
    void abc() {
        System.out.println("A클래스 abc()");
    }
    class B1 {
        void bcd() {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            abc();
        }
    }
}

public class InnerClass_1 {
    public static void main(String[] args) {

    }
}
