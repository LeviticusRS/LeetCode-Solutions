import org.joshua.ransom.solutions.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    void testTwoSwum() {
        var twoSum = new TwoSum();
        var nums = new int[]{2, 7, 11, 15};
        var target = 9;

        var result = twoSum.bruteForce(nums, target);

        var expected = new int[]{0, 1};
        assertArrayEquals(expected, result);
    }
}