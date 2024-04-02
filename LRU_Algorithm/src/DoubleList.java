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

    /**
     * Add the node at tail
     * @param x
     */
    public void addLast(Node x) {
        x.prev = tail.prev;
        x.next = tail;
        tail.prev.next = x;
        tail.prev = x;
        size++;
    }

    /**
     * Delete given node from double list
     * @param x
     */
    public void remove(Node x) {
        x.prev.next = x.next;
        x.next.prev = x.prev;
        size--;
    }

    /**
     * Remove the first element from double list and return this element.
     * @return
     */
    public Node removeFirst() {
        if (head.next == tail) {
            return null;
        }

        Node first = head.next;
        remove(first);
        return first;
    }

    // Return the size of double list.
    public int size() {return size;}
}
