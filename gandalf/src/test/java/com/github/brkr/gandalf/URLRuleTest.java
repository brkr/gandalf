package com.github.brkr.gandalf;

import com.github.brkr.gandalf.utils.RuleTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 07/03/16.
 */
public class URLRuleTest extends RuleTest {

    @Test
    public void nullStringShouldReturnFalse() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = null;
        setMockText(testStr);
        gandalf.load(mEditText).url(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void emptyStringShouldReturnFalse() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "";
        setMockText(testStr);
        gandalf.load(mEditText).url(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void ipAddressShouldReturnFalse() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "192.168.0.1";
        setMockText(testStr);
        gandalf.load(mEditText).url(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void missingPrefixShouldReturnFalse() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "brkr.github.io/";
        setMockText(testStr);
        gandalf.load(mEditText).url(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void httpsShouldReturnTrue() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "https://brkr.github.io/";
        setMockText(testStr);
        gandalf.load(mEditText).url(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void ftpShouldReturnTrue() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "ftp://brkr.github.io/";
        setMockText(testStr);
        gandalf.load(mEditText).url(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void httpURLShouldReturnTrue() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "http://brkr.github.io/";
        setMockText(testStr);
        gandalf.load(mEditText).url(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void httpWithPortURLShouldReturnTrue() throws Exception {
        Gandalf gandalf = new Gandalf();
        String testStr = "http://brkr.github.io:8080";
        setMockText(testStr);
        gandalf.load(mEditText).url(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }
}
