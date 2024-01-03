package org.joshua.ransom.solutions;

import org.joshua.ransom.TwoParameterSolution;
import org.joshua.ransom.solutions.utils.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists implements TwoParameterSolution<ListNode, ListNode, ListNode> {
    @Override
    public ListNode bruteForce(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        List<Integer> list = new ArrayList<>();

        while (list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(list);

        var listnode = new ListNode(list.remove(0));
        computeListNode(listnode, list);
        return listnode;
    }

    private void computeListNode(ListNode listnode, List<Integer> list) {
        if (list.isEmpty()) {
            return;
        }
        var value = list.remove(0);
        listnode.next = new ListNode(value);
        computeListNode(listnode.next, list);
    }
}

