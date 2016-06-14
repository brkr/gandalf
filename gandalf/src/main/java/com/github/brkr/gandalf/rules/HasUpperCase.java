package com.github.brkr.gandalf.rules;


import com.github.brkr.gandalf.Rule;
import com.github.brkr.gandalf.rules.exceptions.RuleException;

/**
 * Created by berker - berker.gucur@uitsec.com
 * on 14.06.2016.
 */
public class HasUpperCase implements Rule {
    @Override
    public boolean execute(String value) throws RuleException {
        if (!value.equals(value.toLowerCase()))
            return true;
        else
            throw new HasNoUpperCaseException();
    }

    private class HasNoUpperCaseException extends RuleException {

        private static final String ERROR_MESSAGE = "Value has not a lowercase char.";

        public HasNoUpperCaseException() {
            super(ERROR_MESSAGE);
        }
    }
}
