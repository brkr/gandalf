package com.github.brkr.gandalf;

import android.widget.EditText;

import com.github.brkr.gandalf.Gandalf;

import junit.framework.TestCase;

/**
 * @Author :  berkergucur (brkr.gcr@gmail.com) - 06/03/16.
 */
public class GandalfTest extends TestCase {

    @Before
    public void setup(){

    }


    @Test
    public void tesxMinimumLength(){
        Gandalf gandalf = new Gandalf();
        EditText edittext = new EditText();
        edittext.setText("deneme");
        gandalf.load(edittext);

    }



}