package hashmap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        // Adding elements to the map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Map size: " + map.size());

        // Getting values from the map
        int valueA = map.get("A");
        System.out.println("Value of A: " + valueA);

        // Removing elements from the map
        map.remove("B");
        System.out.println("Map size: " + map.size());

        Iterator<ConcurrentHashMap.Entry<String, Integer>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            ConcurrentHashMap.Entry<String, Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey()
                    + ", Value = "
                    + entry.getValue());
        }

    }
}
