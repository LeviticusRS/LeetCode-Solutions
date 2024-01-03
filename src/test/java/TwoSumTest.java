import org.joshua.ransom.solutions.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    void testTwoSwum() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum.twoSumBruteForce(nums, target);

        int[] expected = {0, 1};
        assertArrayEquals(expected, result);
    }
}