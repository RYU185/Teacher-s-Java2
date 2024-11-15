package GenericClass;

// 제네릭타입이 2개 이상인 경우 (갯수제한 없음)
class KeyValue<K,V> {
    private K key;
    private V value;
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
}

public class Generic_5 {
    public static void main(String[] args) {
        // <문자열, 정수>
        // 제네릭타입으로 원시자료형은 사용할 수 없음
        // 원시자료형은 해당 wrapping class를 사용해야함 (Integer, Double등등)
        KeyValue<String, Integer> kv1 = new KeyValue<>();
        kv1.setKey("사과");
        kv1.setValue(1000);
        String key1 = kv1.getKey();
        int value1 = kv1.getValue(); // 자바가 자동으로 형변환해줌
        // <정수, 문자열>
        KeyValue<Integer, String> kv2 = new KeyValue<>();
        kv2.setKey(404); // 웹브라우저 에러코드 404
        kv2.setValue("Not Found Error"); // 에러설명
        int key2 = kv2.getKey();
        String value2 = kv2.getValue();
    }
}








