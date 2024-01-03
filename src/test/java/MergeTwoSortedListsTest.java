import org.joshua.ransom.solutions.MergeTwoSortedLists;
import org.joshua.ransom.solutions.TwoSum;
import org.joshua.ransom.solutions.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoSortedListsTest {

    @Test
    void testmergeTwoSortedLists() {
        var mergeTwoSorted = new MergeTwoSortedLists();
        var node1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        var node2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        var result = mergeTwoSorted.bruteForce(node1, node2);

        var expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(4))))));
        assertLinkedListEquals(expected, result);

        node1 = null;
        node2 = new ListNode(1);

        result = mergeTwoSorted.bruteForce(node1, node2);

        expected = new ListNode(1);
        assertLinkedListEquals(expected, result);
    }

    private void assertLinkedListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }

        assertEquals(expected, actual);
    }
}