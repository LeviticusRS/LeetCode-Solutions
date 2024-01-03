package org.joshua.ransom.solutions;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public int[] twoSumBruteForce(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if (i == j || result.contains(i) || result.contains(j)) {
                    continue;
                }

                int valueOne = nums[i];
                int valueTwo = nums[j];

                if (valueOne + valueTwo == target) {
                    result.add(i);
                    result.add(j);
                }
            }
        }
        int[] resultArray = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            resultArray[k] = result.get(k);
        }

        return resultArray;
    }
}
