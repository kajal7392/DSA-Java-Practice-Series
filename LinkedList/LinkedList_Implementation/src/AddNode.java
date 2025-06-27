public class AddNode {
    // Inner Node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class with various add operations
    static class LinkedList {
        Node head;
        int size;

        public LinkedList() {
            head = null;
            size = 0;
        }

        // 1. Add at the beginning (prepend)
        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
            System.out.println("Added " + data + " at beginning");
        }

        // 2. Add at the end (append)
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
            System.out.println("Added " + data + " at end");
        }

        // 3. Add at specific position
        public void addAt(int data, int position) {
            if (position < 0 || position > size) {
                System.out.println("Invalid position");
                return;
            }

            if (position == 0) {
                addFirst(data);
                return;
            }

            if (position == size) {
                addLast(data);
                return;
            }

            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
            System.out.println("Added " + data + " at position " + position);
        }

        // Print the LinkedList
        public void printList() {
            Node current = head;
            System.out.print("LinkedList: ");
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
            System.out.println("Current size: " + size);
        }
    }

    // Main method to test all add operations
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Test adding at beginning
        list.addFirst(10);
        list.addFirst(20);
        list.printList();

        // Test adding at end
        list.addLast(30);
        list.addLast(40);
        list.printList();

        // Test adding at specific positions
        list.addAt(15, 1);  // Between 20 and 10
        list.addAt(25, 4);  // Between 30 and 40
        list.addAt(5, 0);   // At beginning
        list.printList();
    }
}
