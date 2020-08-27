import org.junit.Test;

import static org.junit.Assert.*;

public class Problem1Test {
    @Test
    public void duplicateTest() {
        int[] arr = {1,2,3,4,3};
        assertEquals(3, Problem1.findDuplicate(arr,4));
    }

}