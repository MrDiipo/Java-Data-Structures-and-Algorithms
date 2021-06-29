package Sets;

import java.util.HashSet;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args){
        //Create first set
        Set<String> s1 = new java.util.LinkedHashSet<>();
        // Add few elements
        s1.add("John");
        s1.add("Adam");
        s1.add("Eve");
        s1.add("Donna");
        // Print data details
        System.out.println("LinkedHashSet: " + s1);
        // Create second second
        Set<String> s2 = new HashSet<>();
        s2.add("John");
        s2.add("Adam");
        s2.add("Eve");
        s2.add("Donna");
        // Print s2 data details
        System.out.println("HashSet: " + s2);

        System.out.println("s1.equals(s2): " + s1.equals(s2));// Returns a boolean True
    }
}
