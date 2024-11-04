public class StaticBlock {
    public static void main(String[] args) {
        System.out.println(B.b); // 5
    }
}

class B {
     int a;
     static int b;
     static { // 스태틱 블록 (정적필드 초기화)
         b = 5;
         System.out.println("클래스 B가 로딩되었습니다.");
     }
}
