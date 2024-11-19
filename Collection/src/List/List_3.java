package List;

import java.util.ArrayList;
import java.util.List;

// ArrayList의 사용법 (메서드사용법)
public class List_3 {
    public static void main(String[] args) {
        List<Integer> aList1 = new ArrayList<>();
        // #1. add (요소추가, 맨뒤에 추가)
        aList1.add(3);
        aList1.add(4);
        aList1.add(5);
        System.out.println(aList1); // [3,4,5]
        // #2. add(int index, E element) (요소추가, 특정 위치에 추가)
        aList1.add(1,6);
        System.out.println(aList1); // [3,6,4,5]
        // #3. addAll (또 다른 리스트를 뒤에 추가)
        List<Integer> aList2 = new ArrayList<>();
        aList2.add(1);
        aList2.add(2);
        aList2.addAll(aList1);
        System.out.println(aList2); // [1, 2, 3, 6, 4, 5]
    }
}








