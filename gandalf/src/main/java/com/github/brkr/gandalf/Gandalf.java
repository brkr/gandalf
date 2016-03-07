package com.github.brkr.gandalf;

import android.widget.EditText;

import com.github.brkr.gandalf.rules.exceptions.RuleException;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author :  berkergucur (brkr.gcr@gmail.com) - 06/03/16.
 */
public class Gandalf {

    /**
     * Validation rules
     */
    private List<Balrog> balrogs;
    private List<RuleException> errors;

    public Gandalf() {
        balrogs = new ArrayList<>();
        errors = new ArrayList<>();
    }

    /**
     * Generates validation rules for EditText etc.
     */
    public Balrog load(EditText editText) {
        Balrog balrog = Balrog.Builder.build(editText);
        balrogs.add(balrog);
        return balrog;
    }


    /**
     * This method just simply return rules pass or not
     *
     * @return validation result
     */
    public boolean shallIPass() {
        boolean check = true;

        for (Balrog balrog : balrogs) {

            try {
                balrog.check();
            } catch (RuleException e) {
                check = false;
                errors.add(e);
            }
        }
        return check;
    }

    /**
     * Return all validation errors.
     * @return validation error list
     */
    public List<RuleException> getErrors() {
        return errors;
    }
}
