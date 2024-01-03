package org.joshua.ransom.solutions;

import org.joshua.ransom.TwoParameterSolution;

import java.util.ArrayList;

public class TwoSum implements TwoParameterSolution<int[], int[], Integer> {

    @Override
    public int[] bruteForce(int[] input, Integer target) {
        var result = new ArrayList<Integer>();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (i == j || result.contains(i) || result.contains(j)) {
                    continue;
                }

                var valueOne = input[i];
                var valueTwo = input[j];

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
