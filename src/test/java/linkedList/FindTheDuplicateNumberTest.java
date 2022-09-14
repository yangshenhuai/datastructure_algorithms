package linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDuplicateNumberTest {

    @Test
    public void testFindDuplicate(){
        assertEquals(3, new FindTheDuplicateNumber().findDuplicate(new int[]{3,1,3,4,2}));
        assertEquals(2, new FindTheDuplicateNumber().findDuplicate(new int[]{1,3,4,2,2}));

    }
}
