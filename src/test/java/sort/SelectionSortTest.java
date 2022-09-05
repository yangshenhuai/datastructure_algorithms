package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectionSortTest {


    @Test
    public void testSelectionTest(){
        assertEquals("[1, 2, 3, 4, 7, 9]", Arrays.toString(new SelectionSort().selectionSort(new int[]{3,1,7,2,9,4})));
    }
}
