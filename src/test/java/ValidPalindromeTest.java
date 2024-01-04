import org.joshua.ransom.solutions.BestTimeBuyAndSellStock;
import org.joshua.ransom.solutions.ValidPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPalindromeTest {

    @Test
    void testValidPalindrome() {
        var validPalindrome = new ValidPalindrome();
        var s = "A man, a plan, a canal: Panama";
        var result = validPalindrome.bruteForce(s);
        assertEquals(true, result);

        s = "race a car";
        result = validPalindrome.bruteForce(s);
        assertEquals(false, result);
    }
}