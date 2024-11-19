package List;

import java.util.Arrays;

// 배열과 리스트의 비교
public class List_1 {
    public static void main(String[] args) {
        String[] array = new String[] {"A","B","C","D"};
        System.out.println(array.length); // 4
        array[2] = null; // 삭제
        // 배열속의 데이터를 요소(element)라고 부름
        // 배열은 요소를 삭제해도 메모리 공간은 남아있고 사이즈도 그대로임
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
    }
}
