public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addBeginning("A");
        list.addLast("B");
        list.addLast("C");
        list.printList();  // Output: A -> B -> C -> null

        list.deleteFirst();
        list.printList();  // Output: B -> C -> null

        list.deleteLast();
        list.printList();  // Output: B -> null

        System.out.println("Size of the list: " + list.getSize());  // Output: 1
    }
}
