package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void textInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
    }

    @Test
    public void textBeforeBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test[]"));
    }

    @Test
    public void textAfterBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]test"));
    }

    @Test
    public void textAroundBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("te[]st"));
    }

    @Test
    public void textAfterSingleLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test"));
    }

    @Test
    public void textBeforeSingleRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test]"));
    }

    @Test
    public void textAfterSingleRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]test"));
    }

    @Test
    public void textBeforeSingleLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test["));
    }

    @Test
    public void backwardsBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void textInBackwardsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]test["));
    }

    @Test
    public void textBeforeBackwardsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test]["));
    }

    @Test
    public void textAfterBackwardsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][test"));
    }

    @Test
    public void textAroundBackwardsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("te][st"));
    }

    @Test
    public void backwardsBracketAfterBracketPairReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test]["));
    }

    @Test
    public void backwardsBracketBeforeBracketPairReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][test]"));
    }

    @Test
    public void alternatingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

    @Test
    public void nestedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
}
