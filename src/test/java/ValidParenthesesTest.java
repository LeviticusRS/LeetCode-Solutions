import org.joshua.ransom.solutions.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidParenthesesTest {

    @Test
    void testTwoSwum() {
        var validParentheses = new ValidParentheses();
        var string = "()";

        var result = validParentheses.bruteForce(string);

        assertEquals(true, result);

        string = "{[]}";
        result = validParentheses.bruteForce(string);
        assertEquals(true, result);

        string = "{]";
        result = validParentheses.bruteForce(string);
        assertEquals(false, result);

        string = "(])";
        result = validParentheses.bruteForce(string);
        assertEquals(false, result);
    }
}