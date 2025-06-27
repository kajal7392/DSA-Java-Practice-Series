public class Node {
    String data;  // Data of the node
    Node next;    // Pointer to the next node

    Node(String data) {  // Constructor
        this.data = data;
        this.next = null;  // By default, next is null
    }
}
