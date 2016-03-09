package com.github.brkr.gandalf;

import com.github.brkr.gandalf.utils.RuleTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 07/03/16.
 */
public class EmailRuleTest extends RuleTest {

    @Test
    public void nullStringShouldReturnFalse() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = null;
        setMockText(testStr);
        gandalf.load(mEditText).email(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void emptyStringShouldReturnFalse() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "";
        setMockText(testStr);
        gandalf.load(mEditText).email(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void emptyWithoutAtShouldReturnFalse() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "brkrgmail.com";
        setMockText(testStr);
        gandalf.load(mEditText).email(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void emptyDomainNameShouldReturnFalse() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "brkr@.com";
        setMockText(testStr);
        gandalf.load(mEditText).email(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void correctEmailAddressShouldReturnTrue() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "brkr@gmail.com";
        setMockText(testStr);
        gandalf.load(mEditText).email(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }
}
