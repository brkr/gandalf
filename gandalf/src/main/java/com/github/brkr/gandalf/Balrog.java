package com.github.brkr.gandalf;

import android.widget.EditText;

import com.github.brkr.gandalf.rules.RuleDecorator;
import com.github.brkr.gandalf.rules.exceptions.RuleException;

import java.util.ArrayList;

/**
 * @Author :  berkergucur (brkr.gcr@gmail.com) - 06/03/16.
 */
public class Balrog extends RuleDecorator{

    private EditText mEditText;

    public Balrog(EditText mEditText) {
        super();
        this.mEditText = mEditText;
        rules = new ArrayList<>();
    }

    /**
     * Check all validation rules
     * @throws RuleException
     */
    public void check() throws RuleException {
        for (Rule rule : rules) {
            String value = mEditText.getText().toString();
            rule.execute(value);
        }
    }

    public static class Builder{
        public static Balrog build(EditText editText){
            return new Balrog(editText);
        }
    }
}
