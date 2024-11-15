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

    }
}
