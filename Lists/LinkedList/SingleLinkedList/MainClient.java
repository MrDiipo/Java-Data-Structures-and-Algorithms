package Lists.LinkedList.SingleLinkedList;

public class MainClient  {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSingleLinkedList(5);
        System.out.println(sLL.size);

        sLL.insertInLinkedList(6,1);
        sLL.insertInLinkedList(7,3);
        sLL.insertInLinkedList(5,11 );
        sLL.insertInLinkedList(56, 2);
        sLL.sllSearching(9);

    }
}
