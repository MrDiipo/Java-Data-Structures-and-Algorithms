package Arrays;

public class main {
    public static void main(String... args){
        SingDimArr sda = new SingDimArr(10);
        sda.insert(0,4);
        sda.insert(1, 7);
        sda.insert(6, 56);
        sda.insert(12,120);

        System.out.println("Array traversal...");

        sda.traverseArray();
        System.out.println("'\nArray Search...");
        sda.searchArray(10);
    }
}
