package Modifier;

class A1 {
    int a = 3;
    final int b = 5; // final을 필드에 적용 가능. 선언과 함께 즉시 초기화
    A1() {}
}
class A2 {
    int a;
    final int b; // 선언 따로 초기화 따로 가능
    A2() { a=3; b=5; } // final은 초기화하지 않으면 에러!!
}
class A3 {
    int a = 3;
    final int b = 5;
    A3() {
        a=5;
        //b=9;
    } // final은 생성자에서도 값을 변경할 수 없음
}
class B {
    void bcd() {
        int a = 3;
        final int b = 5; // final은 지역변수에 사용 가능
        a = 7;
    }
}

public class Final_1 {
}










