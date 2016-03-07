package com.github.brkr.gandalf;

import android.widget.EditText;

import com.github.brkr.gandalf.rules.MaximumLength;
import com.github.brkr.gandalf.rules.MinimumLength;
import com.github.brkr.gandalf.rules.exceptions.RuleException;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author :  berkergucur (brkr.gcr@gmail.com) - 06/03/16.
 */
public class Balrog  implements RuleStrategy{

    private EditText mEditText;
    private List<Rule> rules;

    public Balrog(EditText mEditText) {
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

    /**
     *
     * @param length min size of length
     */
    @Override
    public RuleStrategy min(int length){
        rules.add(new MinimumLength(length));
        return this;
    }

    @Override
    public RuleStrategy max(int length) {
        rules.add(new MaximumLength(length));
        return this;
    }

    public static class Builder{
        public static Balrog build(EditText editText){
            return new Balrog(editText);
        }
    }
}
