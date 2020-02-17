import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        MyHashMap <String, Integer> myHashMap = new MyHashMap<>();

        for (int i = 0; i < 200; i++) {
            myHashMap.put("Privet"+i, i);
        }

        myHashMap.put("Privet1", 100);

        System.out.println(myHashMap.toString());




    }
}
