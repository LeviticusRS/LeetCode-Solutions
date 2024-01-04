import org.joshua.ransom.solutions.BestTimeBuyAndSellStock;
import org.joshua.ransom.solutions.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeBuyAndSellStockTest {

    @Test
    void testBestTimeBuyAndSellStock() {
        var bestTimeBuyAndSell = new BestTimeBuyAndSellStock();
        var stocks = new int[] { 7, 1, 5, 3, 6, 4 };
        var result = bestTimeBuyAndSell.bruteForce(stocks);
        assertEquals(5, result);

        stocks = new int[] { 7, 6, 4, 3, 1 };
        result = bestTimeBuyAndSell.bruteForce(stocks);
        assertEquals(0, result);
    }
}