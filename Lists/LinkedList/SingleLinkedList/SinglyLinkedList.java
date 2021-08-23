package Lists.LinkedList.SingleLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Single node creation
    public  Node createSingleLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert
    public  void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0){
            node.next = head;
            head = node;
        } else if (location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location -1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Single linked list traversal
    public void traverseSingleLInkedList() {
        if (head == null) {
            System.out.println("List does not exist.");
        } else {
            Node traverseNode = head;
           for (int i = 0; i < size; i++){
               System.out.print(traverseNode.value);
               if (i != size -1){
                   System.out.print(" -> ");
               }
               traverseNode = traverseNode.next;
            }
           System.out.println("\n");
        }
    }
}
