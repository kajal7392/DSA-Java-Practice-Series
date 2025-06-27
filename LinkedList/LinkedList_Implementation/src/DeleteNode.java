public class DeleteNode {
    // Node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class with delete operations
    static class LinkedList {
        Node head;
        int size;

        public LinkedList() {
            head = null;
            size = 0;
        }

        // Add node for testing
        public void add(int data) {
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
        }

        // 1. Delete first node
        public void deleteFirst() {
            if (head == null) {
                System.out.println("List is empty - nothing to delete");
                return;
            }
            System.out.println("Deleting first node: " + head.data);
            head = head.next;
            size--;
        }

        // 2. Delete last node
        public void deleteLast() {
            if (head == null) {
                System.out.println("List is empty - nothing to delete");
                return;
            }
            
            if (head.next == null) {
                System.out.println("Deleting last (only) node: " + head.data);
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                System.out.println("Deleting last node: " + current.next.data);
                current.next = null;
            }
            size--;
        }

        // 3. Delete node by value (first occurrence)
        public void deleteByValue(int value) {
            if (head == null) {
                System.out.println("List is empty - nothing to delete");
                return;
            }

            if (head.data == value) {
                deleteFirst();
                return;
            }

            Node current = head;
            while (current.next != null && current.next.data != value) {
                current = current.next;
            }

            if (current.next == null) {
                System.out.println("Value " + value + " not found in list");
            } else {
                System.out.println("Deleting node with value: " + value);
                current.next = current.next.next;
                size--;
            }
        }

        // 4. Delete node by position (0-based index)
        public void deleteByPosition(int position) {
            if (head == null) {
                System.out.println("List is empty - nothing to delete");
                return;
            }

            if (position < 0 || position >= size) {
                System.out.println("Invalid position: " + position);
                return;
            }

            if (position == 0) {
                deleteFirst();
                return;
            }

            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            System.out.println("Deleting node at position " + position + ": " + current.next.data);
            current.next = current.next.next;
            size--;
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

    // Main method to test all delete operations
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create a sample list
        for (int i = 1; i <= 5; i++) {
            list.add(i * 10);
        }
        list.printList();

        // Test delete operations
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.deleteByValue(30);
        list.printList();

        list.deleteByPosition(1);
        list.printList();

        // Edge cases
        list.deleteByValue(99); // Not in list
        list.deleteByPosition(5); // Invalid position
        list.printList();
    }
}
