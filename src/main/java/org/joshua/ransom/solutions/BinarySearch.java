package org.joshua.ransom.solutions;

import org.joshua.ransom.TwoParameterSolution;

public class BinarySearch implements TwoParameterSolution<Integer, int[], Integer> {
    @Override
    public Integer bruteForce(int[] nums, Integer target) {
        var midwayIndex = nums.length / 2;
        var midwayValue = nums[midwayIndex];
        if (midwayValue == target) {
            return midwayIndex;
        }
        var midways = target > midwayValue;
        for (int index = midways ? midwayIndex : 0; index < nums.length; index++) {
            if (nums[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
