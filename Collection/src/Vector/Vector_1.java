package Vector;

import java.util.List;
import java.util.Vector;

// List인터페이스의 두번째 구현클래스 Vector 사용법
// 멀티쓰레드 환경에 적합한 동기화기능을 지원한다!!
// 멀티쓰레드를 수행하는데 쓰인다면 Vector를 사용해야함
public class Vector_1 {
    public static void main(String[] args) {
        List<Integer> vector1 = new Vector<>();

        // #1. add 뒤에 추가
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);
        System.out.println(vector1); // [3,4,5]
        // #2. add 중간 삽입
        vector1.add(1,6);
        System.out.println(vector1); // [3,6,4,5]
        // #3. addAll 뒤에 리스트 추가
        List<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2); // [1,2]
        vector2.addAll(vector1);
        System.out.println(vector2); // [1,2,3,6,4,5]

    }
}






