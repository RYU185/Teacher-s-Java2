package Interface;

interface D1 {
    void abc(); // 추상메서드
    public default void bcd() { // default는 접근지정자 아님!!
        System.out.println("인터페이스 D1의 디폴트 메서드");
    }
}
class D2 implements D1 {}
class D3 implements D1 {}

public class Interface_5 {
    public static void main(String[] args) {

    }
}
