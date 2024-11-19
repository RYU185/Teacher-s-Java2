package List;

import java.util.Arrays;

// 배열과 리스트의 비교
public class List_1 {
    public static void main(String[] args) {
        String[] array = new String[] {"A","B","C","D"};
        System.out.println(array.length); // 4
        array[2] = null;
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
    }
}
