import java.util.*;

public class OtherClass {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(9);
        myList.add(3);
        myList.add(45);

        System.out.println(myList);

        Iterator<Integer> ite = myList.iterator();

        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

        Map<Integer, String> myMap = new HashMap<Integer, String>();

        myMap.put(123, "Sunil");
        myMap.put(113, "Sudheer");
        myMap.put(343, "Kumar");
        myMap.put(534, "Prash");

        System.out.println(myMap);

        System.out.println(myMap.keySet());
        System.out.println(myMap.values());

        for (Map.Entry<Integer, String> e: myMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        for (Integer i : myMap.keySet()) {
            System.out.println(i);
        }

        for (String s : myMap.values()) {
            System.out.println(s);
        }
    }
}
