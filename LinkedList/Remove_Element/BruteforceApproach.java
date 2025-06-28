/* Problem Description
Given a linked list, remove the nth node from the end of the list and return its head.

Example:
Input: 1 -> 2 -> 3 -> 4 -> 5, n = 2
Output: 1 -> 2 -> 3 -> 5
*/

// Solution (Using Bruteforce Approach):
public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    int length = 0;
    
    // First pass to count nodes
    ListNode current = head;
    while (current != null) {
        length++;
        current = current.next;
    }
    
    // Calculate position
    length -= n;
    current = dummy;
    
    // Second pass to find node
    while (length > 0) {
        length--;
        current = current.next;
    }
    
    // Remove the node
    current.next = current.next.next;
    return dummy.next;
}
