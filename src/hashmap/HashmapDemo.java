package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put(null, 3);
        map.put("c", null);
        map.put("d", null);

        System.out.println("size of map is -> " + map.size());
        System.out.println("map entries are  -> " + map);


        //No Duplicate Key on HashMap
        //You cannot store duplicate keys in HashMap. However, if you try to store duplicate key with another value, it will replace the value.
        map.put("d", 5);

        //Iterating hashmap using map.entrySet()
        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("a")) {

            // Mapping
            Integer a = map.get("a");

            // Printing value for the corresponding key
            System.out.println("value for key"
                    + " \"a\" is:-> " + a);
        }

        //if you want to remove an entry from the HashMap, you can use the remove() method:
        map.remove("a");
        for (Map.Entry m : map.entrySet()) {
            System.out.println("after removing element -> \n" + m.getKey() + " " + m.getValue());
        }
    }
}
