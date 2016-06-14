package com.github.brkr.gandalf;

import com.github.brkr.gandalf.utils.RuleTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by berker - berker.gucur@uitsec.com
 * on 14.06.2016.
 */
public class HasUpperCaseTest extends RuleTest {

    @Test
    public void upperCaseShouldFalse(){
        Gandalf gandalf = new Gandalf();
        String testStr = "gandalf";
        setMockText(testStr);
        gandalf.load(mEditText).hasUpperCase(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void upperCaseShouldTrue(){
        Gandalf gandalf = new Gandalf();
        String testStr = "Gandalf";
        setMockText(testStr);
        gandalf.load(mEditText).hasUpperCase(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void upperCaseWithNumberShouldTrue(){
        Gandalf gandalf = new Gandalf();
        String testStr = "Gandalf3213215643";
        setMockText(testStr);
        gandalf.load(mEditText).hasUpperCase(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void upperCaseWithSpecialCharShouldTrue(){
        Gandalf gandalf = new Gandalf();
        String testStr = "Gandalf|\\0-=$%##(*&(*!@#";
        setMockText(testStr);
        gandalf.load(mEditText).hasUpperCase(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void upperCaseUnicodeCharShouldTrue(){
        Gandalf gandalf = new Gandalf();
        String testStr = "çşĞ";
        setMockText(testStr);
        gandalf.load(mEditText).hasUpperCase(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void lowerCaseUnicodeCharShouldFalse(){
        Gandalf gandalf = new Gandalf();
        String testStr = "çşğıöü";
        setMockText(testStr);
        gandalf.load(mEditText).hasUpperCase(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }
}
