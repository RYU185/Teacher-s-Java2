package GenericClass;

class Goods {
    private Object object = new Object();
    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }
}

// 모든 클래스의 부모인 Object를 이용하면 문제를 해결할 수 있음
public class Generic_2 {
    public static void main(String[] args) {
        Goods goods1 = new Goods();
        goods1.setObject(new Apple());
        // getObject()는 Object를 리턴하므로 Apple로 다운캐스팅 필요
        Apple apple = (Apple)goods1.getObject();

        Goods goods2 = new Goods();
        goods2.setObject(new Pencil());
        Pencil pencil = (Pencil)goods2.getObject(); // Pencil로 다운캐스팅

        // 실수로 Apple이 담겨있는 goods1 객체에서 Pencil을 꺼냄
        // 하지만 컴파일 에러가 발생하지않음. 이유는???
        Pencil pencil2 = (Pencil)goods1.getObject();
    }
}
