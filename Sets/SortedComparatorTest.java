package Sets;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedComparatorTest {
    public static void main(String[] args){
        // Create a sorted set sorted by Id
        SortedSet<Person> personSortedSetById = new TreeSet<>(Comparator.comparing(Person::getId));
        // Add some persons to the set
        personSortedSetById.add(new Person(1, "John"));
        personSortedSetById.add(new Person(2, "Adam"));
        personSortedSetById.add(new Person(3, "Eve"));
        personSortedSetById.add(new Person(4, "Donna"));
        personSortedSetById.add(new Person(5, "Donna"));
        // Print the set
        System.out.println("Persons by Id:");
        personSortedSetById.forEach(System.out::println);

        // Create a sorted set sorted by name
        SortedSet<Person> personSortedSetByName = new TreeSet<>(Comparator.comparing(Person::getName));
        personSortedSetByName.add(new Person(1, "John"));
        personSortedSetByName.add(new Person(2, "Adam"));
        personSortedSetByName.add(new Person(3, "Eve"));
        personSortedSetByName.add(new Person(4, "Donna"));
        personSortedSetByName.add(new Person(4, "Kip"));

        System.out.println("Persons by Name: ");
        personSortedSetByName.forEach(System.out::println);
    }
}
