package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSet_1 {
    public static void main(String[] args) {
        Set<String> hset1 = new HashSet<>();
        // #1 add
        hset1.add("A");
        hset1.add("B");
        hset1.add("C");
        hset1.add("A"); // 중복저장 안함!!!
        System.out.println(hset1); // [A, B, C] 출력순서가 고정X, 랜덤O
        // #2 addAll
        Set<String> hset2 = new HashSet<>();
        hset2.add("C");
        hset2.add("D");
        hset2.addAll(hset1);
        System.out.println(hset2); // [A, B, C, D] 랜덤출력, 중복저장X
        
    }
}









