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

    // Searching through a single linked list
    public Node sllSearching(int value){
        if (head == null){
            System.out.println("Single linked list not found");
        }
        Node tempNode = head;
        for (int i=0; i<size; i++){
            if (tempNode.value == value){
                System.out.println("The node of value " + value + " is at position " + i);
                return tempNode;
            }
            tempNode = tempNode.next;
            }
        System.out.println("Node not found!");
        return null;
        }

        // Deletion of a node in a linked list
        public void deleteNode(int position){
            if (head == null){
                System.out.println("Linked list not available.");
                return;
            } else if (position == 0){
                head = head.next;
                size--;
                if (size == 0){
                    tail = null;
                }
            } else if (position >= size){
                tail = null;
                Node tempNode = head;
                for (int i = 0; i <= size-1; i++){
                    tempNode = tempNode.next;
                    if (tempNode == head){
                        tail = head = null;
                        size--;
                        return;
                    }
                    tempNode.next = null;
                    tail = tempNode;
                    size--;
            }

            } else {
                Node tempNode = head;
                for (int i = 0; i <= position -1; i++){
                    tempNode = tempNode.next;
                    }
                tempNode.next = tempNode.next.next;
                size--;
            }
        }

        // Delete an entire single linked list
    public void deleteSLL(){
        head = null;
        tail = null;
        System.out.println("The list has been deleted successfully!");
    }

}
