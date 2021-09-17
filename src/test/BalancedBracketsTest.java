package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {


    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void backwardsBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    };
    @Test
    public void bracketedWordsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[I will not break intelliJ]"));
    }
    @Test
    public void unbalancedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }
    @Test
    public void multiBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][]"));
    }
    @Test
    public void nestedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }





}
