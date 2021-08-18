package com.nixsolution.masliuk;

public class Mapp<K, V> implements MapI {

    private K key;
    private V value;
    public Mapp(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public Object getKey() {
        return key;
    }

    @Override
    public Object getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Map{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
