package Sets;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args){
        // Create a set
        Set<String> s1 = new HashSet<>();
        s1.add("John");
        s1.add("Donna");
        s1.add("Ken");
        // Create another set
        Set<String> s2 = new HashSet<>();
        s2.add("Ellen");
        s2.add("Sara");
        s2.add("Donna");

        // Print the elements of both sets
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        // Perform set operations
        performUnion(s1,s2);
        performIntersect(s1,s2);
        performDifference(s1,s2);

    }
    public static void performUnion(Set<String> s1, Set<String> s2){
        Set<String> set1 = new HashSet<>(s1);
        set1.addAll(s2);
        System.out.println("s1 union s2 :" + set1);
    }
    public static void performIntersect( Set<String> s1, Set<String> s2){
        Set<String> set1 = new HashSet<>(s1);
        set1.retainAll(s2);
        System.out.println("s1 intersect s2: " + set1);
    }
    public static void performDifference(Set<String> s1, Set<String> s2){
        Set<String> set1 = new HashSet<>(s1);
        set1.removeAll(s2);
        System.out.println("s1 difference s2: " + set1);
    }
}
