package org.joshua.ransom.solutions;

import org.joshua.ransom.TwoParameterSolution;

import java.util.Arrays;

public class ValidAnagram implements TwoParameterSolution<Boolean, String, String> {

    @Override
    public Boolean bruteForce(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return Arrays.equals(s.chars().sorted().toArray(), t.chars().sorted().toArray());
    }
}
