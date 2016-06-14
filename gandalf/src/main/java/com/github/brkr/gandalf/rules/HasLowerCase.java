package com.github.brkr.gandalf.rules;

import com.github.brkr.gandalf.Rule;
import com.github.brkr.gandalf.rules.exceptions.RuleException;

/**
 * Created by berker - berker.gucur@uitsec.com
 * on 14.06.2016.
 */
public class HasLowerCase implements Rule {
    @Override
    public boolean execute(String value) throws RuleException {
        if (!value.equals(value.toUpperCase()))
            return true;

        throw new HasNoLoweCaseException();
    }

    private class HasNoLoweCaseException extends RuleException {

        private static final String ERROR_MESSAGE = "Value has not a uppercase char.";

        public HasNoLoweCaseException() {
            super(ERROR_MESSAGE);
        }
    }
}
