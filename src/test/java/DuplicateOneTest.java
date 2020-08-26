import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateOneTest {
    @Test
    public void duplicateTest() {
        int[] arr = {1,2,3,4,3};
        assertEquals(3,DuplicateOne.findDuplicate(arr,4));
    }

}