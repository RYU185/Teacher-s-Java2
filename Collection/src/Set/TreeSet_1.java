package Set;

import java.util.TreeSet;

public class TreeSet_1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        // TreeSet에 정수데이터를 자동으로 추가
        for (int i=50; i>0; i-=2) {
            treeSet.add(i);
        }
        // 50,48,46... 순서로 데이터입력했지만 자동으로 정렬되어 출력됨
        System.out.println(treeSet); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
        
    }
}








