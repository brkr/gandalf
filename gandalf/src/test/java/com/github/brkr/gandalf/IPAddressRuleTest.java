package com.github.brkr.gandalf;

import com.github.brkr.gandalf.utils.RuleTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 07/03/16.
 */
public class IPAddressRuleTest extends RuleTest {

    @Test
    public void nullStringShouldReturnFalse() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = null;
        setMockText(testStr);
        gandalf.load(mEditText).ipAddress(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void emptyStringShouldReturnFalse() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "";
        setMockText(testStr);
        gandalf.load(mEditText).ipAddress(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void extraAddressShouldReturnFalse() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "192.168.0.1.1";
        setMockText(testStr);
        gandalf.load(mEditText).ipAddress(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void missingAddressShouldReturnFalse() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "192.168";
        setMockText(testStr);
        gandalf.load(mEditText).ipAddress(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }
    
    @Test
    public void over256AddressShouldReturnFalse() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "192.168.256.0";
        setMockText(testStr);
        gandalf.load(mEditText).ipAddress(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void correctEmailAddressShouldReturnTrue() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "192.168.1.1";
        setMockText(testStr);
        gandalf.load(mEditText).ipAddress(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }
}
