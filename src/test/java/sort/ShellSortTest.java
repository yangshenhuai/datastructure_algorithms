package sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShellSortTest {


    @Test
    public void testShellSort(){
        String result = Arrays.toString(new ShellSort().shellSort(new int[]{114, 131, 118, 85, 156, 147, 126, 15, 178, 159, 64, 93, 176, 141, 175, 63, 83, 123, 60, 44}));
        assertEquals("[15, 44, 60, 63, 64, 83, 85, 93, 114, 118, 123, 126, 131, 141, 147, 156, 159, 175, 176, 178]",result);
        result = Arrays.toString(new ShellSort().shellSort(new int[]{10,8,9,7,6,4,5,2,1}));
        assertEquals("[1, 2, 4, 5, 6, 7, 8, 9, 10]",result);
        result = Arrays.toString(new ShellSort().shellSort(new int[]{1}));
        assertEquals("[1]",result);
    }
}
