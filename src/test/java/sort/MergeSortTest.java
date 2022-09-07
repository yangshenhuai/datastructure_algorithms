package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {

    @Test
    public void testMergeSort(){
        int[] arr = new int[]{38,27,43,3,9,82,10};
        new MergeSort().mergeSort(arr,0,arr.length-1);
        assertEquals("[3, 9, 10, 27, 38, 43, 82]",Arrays.toString(arr));


    }
}
