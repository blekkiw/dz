public class MyHashEntry <KEY, VALUE> {

    private KEY key;
    private VALUE value;

    public MyHashEntry(KEY key, VALUE value) {
        this.key = key;
        this.value = value;
    }

    public KEY getKey() {
        return key;
    }

    public void setKey(KEY key) {
        this.key = key;
    }

    public VALUE getValue() {
        return value;
    }

    public void setValue(VALUE value) {
        this.value = value;
    }



    @Override
    public String toString() {
        return "MyHashEntry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
