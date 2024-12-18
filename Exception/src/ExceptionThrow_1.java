class A {
    void abc() {
        bcd();
    }
    void bcd() {
        // 예외가 발생하는 메서드에서 바로 예외처리(try~catch)
        try {
            System.out.println(3/0);
        }catch (ArithmeticException e) {
            System.out.println("클래스 A 예외 발생");
            System.out.println(e.getMessage());
        }
    }
}

class B {
    void abc() {
        try{
            bcd();
            System.out.println("예외 발생후 출력이 될까?");
        }catch (ArithmeticException e) {
            System.out.println("클래스 B 예외 발생");
            System.out.println(e.getMessage());
        }
    }
    void bcd() throws ArithmeticException {
        System.out.println(3/0); // 예외발생하나 예외전가처리
    }
}

public class ExceptionThrow_1 {
    public static void main(String[] args) {
        B b = new B();
        b.abc();
    }
}
