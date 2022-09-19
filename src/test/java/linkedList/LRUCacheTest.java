package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LRUCacheTest {
    @Test
    public void testLRU(){

        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        assertEquals(1,cache.get(1));
        cache.put(3,3);
        assertEquals(-1,cache.get(2));
        cache.put(4,4);
        assertEquals(-1,cache.get(1));
        assertEquals(3,cache.get(3));
        assertEquals(4,cache.get(4));


        cache = new LRUCache(2);
        cache.put(1,0);
        cache.put(2,2);
        assertEquals(0,cache.get(1));
        cache.put(3,3);
        assertEquals(-1,cache.get(2));
        cache.put(4,4);
        assertEquals(-1,cache.get(1));

        cache = new LRUCache(2);
        cache.put(2,1);
        cache.put(2,2);
        assertEquals(2,cache.get(2));
        cache.put(1,1);
        cache.put(4,1);
        assertEquals(-1,cache.get(2));

        cache = new LRUCache(2);
        cache.put(2,1);
        cache.put(3,2);
        assertEquals(2,cache.get(3));
        assertEquals(1,cache.get(2));
        cache.put(4,3);
        assertEquals(1,cache.get(2));
        assertEquals(-1,cache.get(3));
        assertEquals(3,cache.get(4));


    }

}
