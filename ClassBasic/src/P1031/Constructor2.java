package P1031;

public class Constructor2 {
    // 생성자의 오버로딩
    public static void main(String[] args) {

    }
}
class AA {
    int a;
    int b;
    String str;
    // 생성자의 오버로딩
    // 생성자의 이름은 같고, 매개변수의 갯수 또는 타입이 다른 것
    AA() {
        System.out.println("기본생성자");
    }
    AA(int a) {
        a = a;
        System.out.println("매개변수 1개 int");
    }
    AA(String str) { // 매개변수의 타입이 달라도 오버로딩 성립!!
        str = str;
        System.out.println("매개변수 1개 문자열");
    }
    AA(int a, int b) {
        a = a;
        b = b;
        System.out.println("매개변수 2개");
    }
}







