package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {


    @Test
    public void testQuickSort(){
        String result = new QuickSort().quickSort(Arrays.asList(114, 131, 118, 85, 156, 147, 126, 15, 178, 159, 64, 93, 176, 141, 175, 63, 83, 123, 60, 44)).toString();
        assertEquals("[15, 44, 60, 63, 64, 83, 85, 93, 114, 118, 123, 126, 131, 141, 147, 156, 159, 175, 176, 178]",result);

    }

}
