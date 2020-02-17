
public class Main {
    public static void main(String[] args) {

        MyHashMap <String, Integer> myHashMap = new MyHashMap<>();

        for (int i = 0; i < 200; i++) {
            myHashMap.put("Privet"+i, i);
        }

        myHashMap.put("Privet1", 100);
        myHashMap.remove(5);
        myHashMap.remove(2);
        myHashMap.remove(10);

        System.out.println(myHashMap.toString());




    }
}
