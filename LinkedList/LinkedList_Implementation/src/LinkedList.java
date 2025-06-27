public class LinkedList {
    Node head;  // Head of the list
    int size;   // Size of the list

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add at the beginning
    public void addBeginning(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Add at the end
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        size++;
    }

    // Print the list
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
        size--;
    }

    // Delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node secondLast = head;
            Node lastNode = head.next;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }
        size--;
    }

    // Get size of the list
    public int getSize() {
        return size;
    }
}
