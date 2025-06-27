public class PrintList {
    // Node class
    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class with print/traversal methods
    static class LinkedList {
        Node head;
        int size;

        public LinkedList() {
            head = null;
            size = 0;
        }

        // Add node for testing
        public void add(String data) {
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

        // 1. Basic print method
        public void printBasic() {
            Node current = head;
            System.out.print("Basic Print: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        // 2. Fancy print with arrows
        public void printWithArrows() {
            Node current = head;
            System.out.print("Arrow Print: ");
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) {
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println(" -> null");
        }

        // 3. Print using StringBuilder (more efficient)
        public void printWithBuilder() {
            StringBuilder sb = new StringBuilder();
            Node current = head;
            sb.append("Builder Print: ");
            while (current != null) {
                sb.append(current.data);
                if (current.next != null) {
                    sb.append(" ~> ");
                }
                current = current.next;
            }
            sb.append(" ~> null");
            System.out.println(sb.toString());
        }

        // 4. Recursive print (forward)
        public void printRecursive(Node current) {
            if (current == null) {
                System.out.println("null");
                return;
            }
            System.out.print(current.data + " | ");
            printRecursive(current.next);
        }

        // 5. Reverse print (using recursion stack)
        public void printReverse(Node current) {
            if (current == null) {
                System.out.print("Reverse Print: ");
                return;
            }
            printReverse(current.next);
            System.out.print(current.data + " ");
        }

        // 6. Print with index positions
        public void printWithIndex() {
            Node current = head;
            int index = 0;
            System.out.println("Indexed Print:");
            while (current != null) {
                System.out.println("[" + index + "] " + current.data);
                current = current.next;
                index++;
            }
        }

        // Utility method to get size
        public int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create sample list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Test all print methods
        System.out.println("LinkedList with " + list.getSize() + " elements:");
        System.out.println("----------------------------------");
        
        list.printBasic();
        list.printWithArrows();
        list.printWithBuilder();
        
        System.out.print("Recursive Print: ");
        list.printRecursive(list.head);
        
        list.printReverse(list.head);
        System.out.println();
        
        list.printWithIndex();
    }
}
