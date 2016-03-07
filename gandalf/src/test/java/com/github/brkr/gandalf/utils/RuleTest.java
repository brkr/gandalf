package com.github.brkr.gandalf.utils;

import android.test.mock.MockContext;
import android.text.Editable;
import android.widget.EditText;

import org.junit.Before;
import org.mockito.Mockito;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 07/03/16.
 */
public class RuleTest {


    protected EditText mEditText;
    protected Editable mEditable;

    @Before
    public void setUp() throws Exception {
        MockContext context = new MockContext();
        mEditText = Mockito.mock(EditText.class);
        mEditable = Mockito.mock(Editable.class);
    }

    protected void setMockText(String testStr) {
        Mockito.when(mEditText.getText()).thenReturn(mEditable);
        Mockito.when(mEditable.toString()).thenReturn(testStr);
    }
}
