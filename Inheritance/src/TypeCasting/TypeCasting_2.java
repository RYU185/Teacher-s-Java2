package TypeCasting;

class C {}
class D extends C {}

public class TypeCasting_2 {
    public static void main(String[] args) {
        C value1 = new C(); // 부모클래스 C의 인스턴스
        C value2 = new D(); // 자식클래스 D의 인스턴스를 부모인 C로 업캐스팅
        System.out.println(value1 instanceof C); // true
        System.out.println(value2 instanceof C); // true
        System.out.println(value1 instanceof D); // false
        System.out.println(value2 instanceof D); // true
        // instanceof는 뒤에 적는 클래스의 특징(=속성)을
        // 가지고 있는지 물어보는 키워드
        if (value1 instanceof D) {
            D d = (D)value1;
            System.out.println("value1을 D로 다운캐스팅");
        }else {
            System.out.println("value1은 D로 다운캐스팅 불가!!");
        }
    }
}





