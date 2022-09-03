package binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeBasedKeyValueStoreTest {

    @Test
    public void testTimeMap(){

        TimeMap timeMap = new TimeMap();
        timeMap.set("foo","bar",1);
        assertEquals("bar",timeMap.get("foo",1));
        assertEquals("bar",timeMap.get("foo",3));
        timeMap.set("foo","bar2",4);

        assertEquals("bar2",timeMap.get("foo",4));
        assertEquals("bar2",timeMap.get("foo",5));
        assertEquals("bar",timeMap.get("foo",3));
        assertEquals("bar",timeMap.get("foo",2));


        timeMap.set("love","high",10);
        timeMap.set("love","low",20);
        assertEquals("",timeMap.get("love",5));
    }
}
