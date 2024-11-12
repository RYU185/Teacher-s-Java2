package Interface;
// 인터페이스 사용

interface B1 {
    int a = 3; // 인터페이스의 정적상수필드는 반드시 초기값이 필요함
    void abc(); // abstract가 없어도 자동으로 추상메서드임
}
class B2 implements B1 {
    @Override
    public void abc() {
        System.out.println("인터페이스 B1의 자식클래스");
    }
}

public class Interface_3 {
}
