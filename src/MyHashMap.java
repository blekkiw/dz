import java.util.Arrays;

public class MyHashMap <KEY, VALUE> {

    private MyHashEntry <KEY, VALUE> [] myHashEntries;

    Class keyClass;
    Class valueClass;

    public MyHashMap() {
        myHashEntries=new MyHashEntry [100];
    }

    public void remove (Object object) {
        if (object.getClass()==keyClass) {
removeKey((KEY) object);
        }
        if (object.getClass()==valueClass) {
            removeValue ((VALUE) object);
        }
    }

    private void removeKey(KEY object) {

        for (int i = 0; i < myHashEntries.length; i++) {
            if (myHashEntries[i]==null) {
                continue;
            }
            if (myHashEntries[i].getKey().equals(object)) {
                myHashEntries[i]=null;
                break;
            }
        }
    }


    private void removeValue(VALUE object) {
        for (int i = 0; i < myHashEntries.length; i++) {
            if (myHashEntries[i]==null) {
                continue;
            }
            if (myHashEntries[i].getValue().equals(object)) {
                myHashEntries[i]=null;
                break;
            }
        }
    }

//    public void remove (KEY key) {
//        for (MyHashEntry<KEY, VALUE> myHashEntry : myHashEntries) {
//            if (myHashEntry==null) {
//                break;
//            }
//            if (myHashEntry.getKey().equals(key))
//                myHashEntry=null;
//            break;
//        }
//    }




    public void put (KEY key, VALUE value) {
        MyHashEntry <KEY, VALUE> myHashEntry = new MyHashEntry<>(key,value);
        keyClass=key.getClass();
        valueClass=value.getClass();
        for (int i = 0; i < myHashEntries.length; i++) {
            if (myHashEntries[i]==null) {
                myHashEntries[i]=myHashEntry;
                break;
            }
            if (i==myHashEntries.length-1) {
                extendArray();
            }
            if (myHashEntries[i].getKey().equals(key)) {
                myHashEntries[i]=myHashEntry;
                break;
            }
        }
    }



    private void extendArray () {
        MyHashEntry <KEY, VALUE> [] tempArray = new MyHashEntry [myHashEntries.length+10];
        for (int i = 0; i < myHashEntries.length ; i++) {
            tempArray[i]=myHashEntries[i];
        }
        myHashEntries=tempArray;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "myHashEntries=" + Arrays.toString(myHashEntries) +
                '}';
    }
}
