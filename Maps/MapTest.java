package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("John", "(342)113-9878");
        map.put("Richard", "(234) 453-2345");
        map.put("Donna", "34523-4542");
        map.put("Rex", "09034321254");
        // Print Details
        printDetails(map);
        // Clear map
        //map.clear();
        // Print details again
        //printDetails(map);
        // Get a set of the key values in the map
        listKeys(map);
        // Collection of entries
        listValues(map);

        listEntries(map);
    }
    public static void printDetails(Map<String, String> map){
        // Get the value of the Donna Key
        String donnaPhone = map.get("Donna");
        // Print Details
        System.out.println("Map" + map);
        System.out.println("Map size: " + map.size());
        System.out.println("Map is empty: " + map.isEmpty());
        System.out.println("Map contain Donna key: " + map.containsKey("Donna"));
        System.out.println("Donna phone: " + map.get("Donna"));
        System.out.println("Donna key is removed: " + map.remove("Donna"));
    }
    public static void listKeys(Map<String, String> map){
        System.out.println("Key Set...");
        Set<String> listKeys = map.keySet();
        listKeys.forEach(System.out::println);
        System.out.println();
    }
    public static void listValues(Map<String, String> map){
        System.out.println("Value Set...");
        Collection<String> listValues = map.values();
        listValues.forEach(System.out::println);
    }
    public static void listEntries(Map<String, String> map){
        System.out.println("Entry set.");
        // Get the entry set
        Set<Map.Entry<String, String>> listEntries = map.entrySet();
        listEntries.forEach((Map.Entry<String, String> entry) -> {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Keys= " + key + ", Value= " + value);
        });

    }
}
