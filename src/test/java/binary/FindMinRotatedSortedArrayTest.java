package binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FindMinRotatedSortedArrayTest {


    @Test
    public void testFindMin(){
        FindMinRotatedSortedArray findMinRotatedSortedArray = new FindMinRotatedSortedArray();

        assertEquals(1,findMinRotatedSortedArray.findMin(new int[]{2,1}));
        assertEquals(1,findMinRotatedSortedArray.findMin(new int[]{1}));
        assertEquals(1,findMinRotatedSortedArray.findMin(new int[]{3,4,5,1,2}));
        assertEquals(0,findMinRotatedSortedArray.findMin(new int[]{4,5,6,7,0,1,2}));
        assertEquals(11,findMinRotatedSortedArray.findMin(new int[]{11,13,15,17}));
    }
}
