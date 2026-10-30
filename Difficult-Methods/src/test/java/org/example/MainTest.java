package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @Test
    void isBalancedAcceptsBalancedParentheses() {
        String[] balancedInputs = {"", "()", "()()", "(())", "(()(()))"};

        for (String input : balancedInputs) {
            assertTrue(Main.isBalanced(input), () -> "isBalanced should accept: " + input);
        }
    }

    @Test
    void isBalancedRejectsUnbalancedParentheses() {
        String[] unbalancedInputs = {")", "(", "(()", "())", ")(", "(()))"};

        for (String input : unbalancedInputs) {
            assertFalse(Main.isBalanced(input), () -> "isBalanced should reject: " + input);
        }
    }
}
