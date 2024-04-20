/**
 * @author Shaohua Guo
 * This Algorithm should sort the element as its frequency being accessed
 * If the frequencies are same, then sort as the time it appeared
 */
public class LFUCache {

    int capacity;

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    /**
     * It would return the value of the corresponding key if the key exists, -1 otherwise.
     * @param key
     * @return
     */
    public int get(int key) {
        return 0;
    }

    /**
     * If the key exists, then modify the corresponding value, insert this pair otherwise.
     * If it touches to the capacity of the cache, remove the least accessed frequency data then insert new one.
     * If there are many data with same accessed frequency, then remove the oldest one.
     * @param key
     * @param val
     */
    public void put(int key, int val) {

    }
}
