package binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EatBananasTest {

    @Test
    public void testMinEatingSpeed(){

        assertEquals(4,new EatBananas().minEatingSpeed(new int[]{3,6,7,11},8));
        assertEquals(30,new EatBananas().minEatingSpeed(new int[]{30,11,23,4,20},5));
        assertEquals(23,new EatBananas().minEatingSpeed(new int[]{30,11,23,4,20},6));
        assertEquals(3,new EatBananas().minEatingSpeed(new int[]{805306368,805306368,805306368},1000000000));
    }

}
