public class SizeOfList {
    // Node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class with size tracking implementations
    static class LinkedList {
        Node head;
        private int sizeCounter;  // Approach 1: Maintain counter

        public LinkedList() {
            head = null;
            sizeCounter = 0;
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
            sizeCounter++;  // Increment counter
        }

        // ===== SIZE CALCULATION METHODS ===== //

        // 1. Get size using counter (O(1)) 
        public int getSizeCounter() {
            return sizeCounter;
        }

        // 2. Iterative count (O(n))
        public int getSizeIterative() {
            int count = 0;
            Node current = head;

            while (current != null) {
                count++;
                current = current.next;
            }

            return count;
        }

        // 3. Recursive count (O(n))
        public int getSizeRecursive(Node node) {
            // Base case
            if (node == null) {
                return 0;
            }
            // Recursive case
            return 1 + getSizeRecursive(node.next);
        }

        // Helper method to start recursion from head
        public int getSizeRecursiveWrapper() {
            return getSizeRecursive(head);
        }

        // Print list contents
        public void printList() {
            Node current = head;
            System.out.print("LinkedList: ");
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Main method to test all size methods
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add sample values
        for (int i = 1; i <= 5; i++) {
            list.add(i * 10);  // 10, 20, 30, 40, 50
        }

        // Print the list
        list.printList();

        // Test all size calculation methods
        System.out.println("\nSize Calculation Results:");
        System.out.println("1. Counter method:   " + list.getSizeCounter());
        System.out.println("2. Iterative count: " + list.getSizeIterative());
        System.out.println("3. Recursive count: " + list.getSizeRecursiveWrapper());

        // Demonstrate dynamic updates
        System.out.println("\nAfter adding two more nodes:");
        list.add(60);
        list.add(70);
        list.printList();

        System.out.println("\nUpdated Sizes:");
        System.out.println("1. Counter method:   " + list.getSizeCounter());
        System.out.println("2. Iterative count: " + list.getSizeIterative());
        System.out.println("3. Recursive count: " + list.getSizeRecursiveWrapper());
    }
}
