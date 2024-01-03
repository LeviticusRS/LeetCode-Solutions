package org.joshua.ransom.solutions;

import org.joshua.ransom.Solution;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses implements Solution<Boolean, String> {

    @Override
    public Boolean bruteForce(String input) {
        var inputCharArray = input.toCharArray();
        var chars = new HashMap<Character, Character>();
        chars.put('(', ')');
        chars.put('{', '}');
        chars.put('[', ']');
        var stack = new Stack<Character>();
        for (int index = 0; index < inputCharArray.length; index++) {
            var bracket = inputCharArray[index];
            if (chars.containsKey(bracket)) {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                var currentInStack = stack.peek();
                if (chars.get(currentInStack) == bracket) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
