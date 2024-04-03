public class Test {
    public static void main(String[] args) {
//        LRUCache lruCache = new LRUCache(2);
//        lruCache.put(1, 1);
//        lruCache.put(2, 2);
//        System.out.println(lruCache.get(1)); // return 1
//        lruCache.put(3, 3);
//        System.out.println(lruCache.get(2)); // return -1
//        lruCache.put(4, 4);
//        System.out.println(lruCache.get(1)); // return -1
//        System.out.println(lruCache.get(3)); // return 3
//        System.out.println(lruCache.get(4)); // return 4

        LRUCacheII lruCacheII = new LRUCacheII(2);
        lruCacheII.put(1, 1);
        lruCacheII.put(2, 2);
        System.out.println(lruCacheII.get(1)); // 1
        lruCacheII.put(3, 3);
        System.out.println(lruCacheII.get(2)); // -1
        lruCacheII.put(4, 4);
        System.out.println(lruCacheII.get(1)); // -1
        System.out.println(lruCacheII.get(3)); // 3
        System.out.println(lruCacheII.get(4)); // 4
    }
}
