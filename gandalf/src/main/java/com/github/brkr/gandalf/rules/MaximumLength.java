package com.github.brkr.gandalf.rules;

import com.github.brkr.gandalf.Rule;
import com.github.brkr.gandalf.rules.exceptions.RuleException;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 07/03/16.
 */
public class MaximumLength implements Rule {

    private int length;

    public MaximumLength(int length) {
        this.length = length;
    }

    @Override
    public boolean execute(String value) throws RuleException {

        if (value.length() <= length)
            return true;
        else
            throw new MaximumLengthException();
    }


    public static class MaximumLengthException extends RuleException {

        private final static String ERROR_MESSAGE = "Length maximum";

        public MaximumLengthException(String message) {
            super(message);
        }

        public MaximumLengthException() {
            super(ERROR_MESSAGE);
        }
    }
}
