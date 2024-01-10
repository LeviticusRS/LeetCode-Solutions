import org.joshua.ransom.solutions.ValidAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {

    @Test
    void testTwoSwum() {
        var validAnagram = new ValidAnagram();
        var inputOne = "anagram";
        var inputTwo = "nagaram";

        var result = validAnagram.bruteForce(inputOne, inputTwo);

        assertTrue(result);

        inputOne = "fc";
        inputTwo = "ca";

        result = validAnagram.bruteForce(inputOne, inputTwo);

        assertFalse(result);
    }
}