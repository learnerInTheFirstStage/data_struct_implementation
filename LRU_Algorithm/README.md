Decription:

1. Implement the LRU Algorithm:
    * Initialized as a given positive integer capacity.
    * int get(int key) method. If the key is in the cache, return the corresponding value or -1 otherwise.
    * void put(int key, int val). If the key is already existed, then alter the corresponding value or insert this pair
      of key and value. When it touches the capacity, then delete the oldest node at head and add the newest node
      at tail.

2. Requirements or restrictions:
   The time complexity of put and get methods should be O(1).
3. The basic data structures we used:
    * For the sake of O(1) time complexity, the elements in cache should be ordered as time from the oldest to newest.
    When the number of elements get to the capacity, we need to delete the oldest element and set the node we are going
    to add as the newest, i.e. put it at tail.
    * Hash table has a good performance on searching element whereas linked list on insertion. So we could combine these
      two basic data structures to fulfill the requirements.
        