package com.github.brkr.gandalf;

import com.github.brkr.gandalf.utils.RuleTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Author :  berkergucur (brkr.gcr@gmail.com) - 06/03/16.
 */
public class MinimumRuleTest extends RuleTest {


    @Test
    public void testMinimumShouldReturnTrueWhenLengthEqualValueLength() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "gandalf";
        setMockText(testStr);
        gandalf.load(mEditText).min(testStr.length());
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void testMinimumShouldReturnFalseWhenLessThenLength() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "abc";
        setMockText(testStr);
        gandalf.load(mEditText).min(4);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void testMinimumShouldReturnTrueWhenValueLengthGreaterThanLength() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "U shall not pass!";
        setMockText(testStr);
        gandalf.load(mEditText).min(4);
        assertEquals(gandalf.shallIPass(), true);
    }

}
