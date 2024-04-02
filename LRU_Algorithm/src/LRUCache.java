import java.util.HashMap;

public class LRUCache {

    int capacity;
    HashMap<Integer, DoubleList.Node> map;
    DoubleList cache;

    public LRUCache(int cap) {
        this.capacity = cap;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    /**
     * Set the given key as newest.
     * @param key
     */
    public void makeRecently(int key) {
        DoubleList.Node x = map.get(key);
        cache.remove(x); // Remove the node
        cache.addLast(x); // Append it at tail representing it is the newest element.
    }

    /**
     * Add the most recently used element.
     * @param key
     * @param val
     */
    public void addRecently(int key, int val) {
        DoubleList.Node x = new DoubleList.Node(key, val);
        cache.addLast(x);
        map.put(key, x);
    }

    /**
     * Delete the given key from map.
     * @param key
     */
    public void deleteKey(int key) {
        DoubleList.Node x = map.get(key);
        cache.remove(x);
        map.remove(key);
    }

    /**
     * Delete the least recently used element from cache and the corresponding key from map.
     */
    public void removeLeastRecently() {
        DoubleList.Node deleteNode = cache.removeFirst();
        map.remove(deleteNode.key);
    }

    /**
     * Return the value of the given key.
     * @param key
     * @return
     */
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        makeRecently(key); // Set it as newest.
        return map.get(key).val;
    }

    /**
     * Implement the put method.
     * @param key
     * @param val
     */
    public void put(int key, int val) {
        // If the key is already existed, then delete old data
        if (map.containsKey(key)) {
            deleteKey(key);
            addRecently(key, val);
            return;
        }

        // If the cache's size equals to the capacity
        // Delete the least recently used element first and put the newest node.
        if (capacity == cache.size()) {
            removeLeastRecently();
        }

        addRecently(key, val);
    }
}
