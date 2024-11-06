package Overriding;

class S1 {
    static int m = 3; // 정적필드
}
class S2 extends S1 {
    static int m = 4; // 정적필드
}

// 정적필드(static field)의 오버라이딩 여부 확인
public class StaticField {
    public static void main(String[] args) {

    }
}
