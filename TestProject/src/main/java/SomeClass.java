import java.util.*;

public class SomeClass {

    public static void main(String[] args) {

        List<String> myList = new ArrayList();

        myList.add("Sunil");
        myList.add("Sudheer");
        myList.add("Prash");
        myList.add("Praveen");

        System.out.println(myList);

        Iterator<String> it = myList.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(123, "Fremont");
        myMap.put(333, "Hyd");
        myMap.put(456, "San Jose");
        myMap.put(898, "Bangalore");

        System.out.println(myMap);

        for (int i : myMap.keySet()) {
            System.out.println(i);
        }

        for (String s : myMap.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> e : myMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
