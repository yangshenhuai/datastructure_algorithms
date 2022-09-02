import binary.SearchRotatedSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchRotatedSortedArrayTest {


    @Test
    public void testSearch(){
        assertEquals(4, new SearchRotatedSortedArray().search(new int[]{4,5,6,7,0,1,2},0));
        assertEquals(-1, new SearchRotatedSortedArray().search(new int[]{4,5,6,7,0,1,2},3));
        assertEquals(-1, new SearchRotatedSortedArray().search(new int[]{1},0));

        assertEquals(2, new SearchRotatedSortedArray().search(new int[]{5,1,3},3));
        assertEquals(4, new SearchRotatedSortedArray().search(new int[]{4,5,6,7,8,1,2,3},8));

        assertEquals(6, new SearchRotatedSortedArray().search(new int[]{8,1,2,3,4,5,6,7},6));

        assertEquals(1, new SearchRotatedSortedArray().search(new int[]{5,1,2,3,4},1));


    }
}
