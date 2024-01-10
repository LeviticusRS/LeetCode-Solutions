import org.joshua.ransom.solutions.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    void testBinarySearch() {
        var binarySearch = new BinarySearch();
        var input = new int[]{-1, 0, 3, 5, 9, 12};
        var target = 9;
        assertEquals(4, binarySearch.bruteForce(input, target));
    }
}
