import java.util.ArrayList;
import java.util.List;

public class NameList {
    public static void main(String[] args){
        // Create a list of strings
        List<String> names = new ArrayList<>();

        System.out.printf("After creations: Size = %d, Elements = %s%n", names.size(), names);

        // Add some names to the list
        names.add("Ken");
        names.add("Lee");
        names.add("Joe");
        // Print list details
        System.out.printf("After adding three elements: Size = %d, Elements = %s%n", names.size(), names);
        // Remove Lee from the list
        names.remove("Lee");
        // Print the details
        System.out.printf("After removing 1 element: Size = %d, Elements = %s%n", names.size(), names);
        // Clear all elements
        names.clear();
        // Print list details
        System.out.printf("After clearing all elements: Size = %d, Elements = %s%n", names.size(), names);

    }
}
