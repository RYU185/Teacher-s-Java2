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
        super(3);
    }
}

public class Super_2 {
    public static void main(String[] args) {

    }
}
