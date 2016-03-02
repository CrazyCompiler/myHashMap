class Item<K, V> {
    private final K key;
    private V value;

    public Item(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public boolean hasSameKey(K key) {
        return this.key == null ? this.key == key : this.key.equals(key);
    }

    public boolean hasSameValue(V value) {
        return this.value == null ? this.value == value : this.value.equals(value);
    }

    public String toString(){
        return this.key+"="+this.value;
    }
}

