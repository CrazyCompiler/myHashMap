public class MyHashMap<K, V> {
    private int size = 32;
    private Item[] elements;

    public MyHashMap() {
        this(32);
    }

    public MyHashMap(int size) {
        if(this.size<size)
            this.size = size;
        this.elements = new Item[size];
    }

    private long simpleHash(K key) {
        if (key == null) return 0;
        else {
            long hash = 7;
            int count = 0;
            String strKey = key.toString();
            for (int i = 0; i < strKey.length(); i++) {
                hash += Math.pow(31, (strKey.length() - count)) * strKey.charAt(i);
                count++;
            }
            return hash;
        }
    }

    public void put(K key, V value) {
        int index = (int )(simpleHash(key) % this.size);
        elements[index] = new Item<>(key, value);
    }

    public V get(K key) {
        int index = (int )simpleHash(key) % this.size;
        if (elements[index] == null) {
            return null;
        }

        return (V)this.elements[index].getValue();
    }

    public String toString() {
        String stringRepresentation = "{";
        for (Item element : elements) {
            if (element != null && stringRepresentation.length() != 1)
                stringRepresentation += ", " + element;
            if (element != null && stringRepresentation.length() == 1)
                stringRepresentation += element;
        }
        stringRepresentation += "}";
        return stringRepresentation;
    }

}
