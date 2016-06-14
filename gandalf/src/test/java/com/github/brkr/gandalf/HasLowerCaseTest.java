package com.github.brkr.gandalf;

import com.github.brkr.gandalf.utils.RuleTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by berker - berker.gucur@uitsec.com
 * on 14.06.2016.
 */
public class HasLowerCaseTest extends RuleTest {

    @Test
    public void lowerCaseShouldFalse(){
        Gandalf gandalf = new Gandalf();
        String testStr = "TEST123132/.][()";
        setMockText(testStr);
        gandalf.load(mEditText).hasLowerCase(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }

    @Test
    public void lowerCaseShouldTrue() {
        Gandalf gandalf = new Gandalf();
        String testStr = "Gandalf";
        setMockText(testStr);
        gandalf.load(mEditText).hasLowerCase(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void lowerCaseWithNumberShouldTrue(){
        Gandalf gandalf = new Gandalf();
        String testStr = "Gandalf3213215643";
        setMockText(testStr);
        gandalf.load(mEditText).hasLowerCase(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void lowerCaseWithSpecialCharShouldTrue(){
        Gandalf gandalf = new Gandalf();
        String testStr = "Gandalf|\\0-=$%##(*&(*!@#";
        setMockText(testStr);
        gandalf.load(mEditText).hasLowerCase(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void lowerCaseUnicodeCharShouldTrue(){
        Gandalf gandalf = new Gandalf();
        String testStr = "çşğİ";
        setMockText(testStr);
        gandalf.load(mEditText).hasLowerCase(testStr);
        assertEquals(gandalf.shallIPass(), true);
    }

    @Test
    public void lowerCaseUnicodeCharShouldFalse(){
        Gandalf gandalf = new Gandalf();
        String testStr = "ÇŞĞİÜÖ";
        setMockText(testStr);
        gandalf.load(mEditText).hasLowerCase(testStr);
        assertEquals(gandalf.shallIPass(), false);
    }
}
