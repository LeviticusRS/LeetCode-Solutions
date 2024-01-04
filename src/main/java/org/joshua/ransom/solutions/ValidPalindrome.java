package org.joshua.ransom.solutions;

import org.joshua.ransom.Solution;

public class ValidPalindrome implements Solution<Boolean, String> {

    @Override
    public Boolean bruteForce(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        var reversedSum = new StringBuilder(s).reverse().toString();
        return reversedSum.equals(s);
    }
}
