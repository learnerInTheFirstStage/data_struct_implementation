public class DoubleList {

    // Declare an inner class Node as elements of DoubleList
    static class Node {
        public int key, val;

        public Node next, prev;
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    // Declare the head and tail virtual node of doubleList
    Node head, tail;

    // The size of doubleList
    int size;

    // Initialize the doubleList
    public DoubleList() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
}
