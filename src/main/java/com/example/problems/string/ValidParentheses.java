/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.string;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ValidParentheses {
    private final Set<Character> open = new HashSet<>();

    public ValidParentheses() {
        open.add('(');
        open.add('{');
        open.add('[');
    }

    public boolean isValid(String s) {

        Deque<Character> openParentheses = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (isOpenParentheses(current)) {
                openParentheses.offerFirst(current);
            } else {
                Character lastOpen = openParentheses.pollFirst();
                if (lastOpen == null || !areCompetible(lastOpen.charValue(), current)) {
                    return false;
                }
            }
        }

        return openParentheses.isEmpty();
    }

    private boolean isOpenParentheses(char paren) {
        return open.contains(paren);
    }

    private static boolean areCompetible(char open, char close) {
        if (open == '(')
            return close == ')';
        if (open == '[')
            return close == ']';
        if (open == '{')
            return close == '}';
        return false;
    }
}
