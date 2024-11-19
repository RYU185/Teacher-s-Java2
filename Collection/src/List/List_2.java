package List;

import java.util.ArrayList;
import java.util.List;

// List 구현클래스의 생성 예제
public class List_2 {
    public static void main(String[] args) {
        // #1. 구현클래스를 이용하는 방법
        List<Integer> aList1 = new ArrayList<>();
        List<Integer> aList2 = new ArrayList<>(30);
        // ArrayList 내부적으로 메모리용량을 미리 예약해두는 개념이며
        // 실제 size는 아님!!
        System.out.println(aList2.size()); // 0
    }
}
