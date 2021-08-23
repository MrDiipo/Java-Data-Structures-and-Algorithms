package Lists.LinkedList.SingleLinkedList;

public class MainClient  {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSingleLinkedList(5);
        System.out.println(sLL.size);

        sLL.insertInLinkedList(6,0);

    }
}
