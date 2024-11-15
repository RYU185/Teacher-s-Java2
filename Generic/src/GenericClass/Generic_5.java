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
}
