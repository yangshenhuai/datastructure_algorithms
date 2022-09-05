package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {

    @Test
    public void testBubbleSort(){
        assertEquals("[1, 2, 3, 4, 7, 9]", Arrays.toString(new BubbleSort().bubbleSort(new int[]{3,1,7,2,9,4})));
    }
}
