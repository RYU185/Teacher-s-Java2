package Super1;

class AA {
    AA() {
        System.out.println("A생성자");
    }
}
class BB extends AA {
    BB() {
        super();
        System.out.println("B생성자");
    }
}
class CC {
    CC(int a) {
        System.out.println("C생성자");
    }
}
class DD extends CC {
    DD() {
        //super(); // 부모에게 기본생성자가 없으므로 에러 발생
        super(3);
    }
}

public class Super_2 {
    public static void main(String[] args) {
        BB value1 = new BB();
    }
}
