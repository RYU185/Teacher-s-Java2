public class StaticBlock {
    public static void main(String[] args) {

    }
}

class B {
     int a;
     static int b;
     static {
         b = 5;
         System.out.println("클래스 B가 로딩되었습니다.");
     }
}
