
import java.util.HashMap;
import java.util.Map;

public class LearnMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        // put method is used to add elements in to the Map....
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        // if (!map.containsKey("Two")) {
        //     map.put("Two", 22);
        // }
        // alternative....
        System.out.println(map.containsValue(5));
        map.putIfAbsent("Two", 22); // it is used to avoid overright...
        System.out.println(map);

        //iterate...
        for (Map.Entry<String, Integer> en : map.entrySet()) {
            // System.out.println(en.getKey());
            // System.out.println(en.getValue());
            System.err.println(en);

        }
        // is we want to return specifically keys from the given map then we can KeySet..
        for (String s : map.keySet()) {
            System.out.println(s);
        }
        // similarily if we want only value set from the given map then we can use Values
        for (Integer s : map.values()) {
            System.out.println(s);
        }
    }

}
