package com.github.brkr.gandalf;

import com.github.brkr.gandalf.utils.RuleTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 07/03/16.
 */
public class MaximumRuleTest extends RuleTest {

    @Test
    public void testMaximumShouldReturnTrueWhenLengthEqualValueLength() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "gandalf";
        setMockText(testStr);
        gandalf.load(mEditText).max(testStr.length());
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void testMaximumShouldReturnTrueWhenLessThenLength() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "abc";
        setMockText(testStr);
        gandalf.load(mEditText).max(4);
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void testMinimumShouldReturnFalseWhenValueLengthGreaterThanLength() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "U shall not pass!";
        setMockText(testStr);
        gandalf.load(mEditText).max(4);
        assertEquals(gandalf.shallIPass(), false);
    }

}
