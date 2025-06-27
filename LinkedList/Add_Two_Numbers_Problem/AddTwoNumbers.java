public class AddTwoNumbers {
    // Node class for the linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Method to add two numbers represented by linked lists
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy head for the result list
        ListNode current = dummyHead; // Pointer to build the new list
        int carry = 0; // Initialize carry to 0

        // Loop until both lists are exhausted
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with carry

            // Add value from l1 if available
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; // Move to the next node
            }

            // Add value from l2 if available
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // Move to the next node
            }

            // Update carry for the next iteration
            carry = sum / 10;
            // Create a new node with the digit value (sum % 10)
            current.next = new ListNode(sum % 10);
            current = current.next; // Move to the next node in the result list
        }

        return dummyHead.next; // Return the next node of dummy head (the actual result)
    }

    // Method to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the addTwoNumbers method
    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();

        // Create first linked list: 2 -> 4 -> 3 (represents 342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create second linked list: 5 -> 6 -> 4 (represents 465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Add the two numbers
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        System.out.print("Result: ");
        solution.printList(result); // Expected output: 7 -> 0 -> 8 -> null
    }
}
