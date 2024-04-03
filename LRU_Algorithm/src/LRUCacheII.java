import java.util.LinkedHashMap;

public class LRUCacheII {
    int capacity;
    LinkedHashMap<Integer, Integer> cache;

    public LRUCacheII(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<>();
    }

    /**
     * Set the given key as newest.
     * @param key
     */
    public void makeRecently(int key) {
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key, val);
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1;
        makeRecently(key);
        return cache.get(key);
    }

    public void put(int key, int val) {
        if (cache.containsKey(key)) {
            cache.put(key, val);
            makeRecently(key);
            return;
        }

        if (cache.size() == capacity) {
            int oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }

        cache.put(key, val);
    }
}
