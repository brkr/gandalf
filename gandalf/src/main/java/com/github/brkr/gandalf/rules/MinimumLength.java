package com.github.brkr.gandalf.rules;

import com.github.brkr.gandalf.Rule;
import com.github.brkr.gandalf.rules.exceptions.RuleException;

/**
 * @Author :  berkergucur (brkr.gcr@gmail.com) - 06/03/16.
 */
public class MinimumLength implements Rule {
    private int length;

    public MinimumLength(int length) {
        this.length = length;
    }

    @Override
    public boolean execute(String value) throws RuleException {

        if (value.length() >= length)
            return true;
        else
            throw new MinimumException();
    }


    public static class MinimumException extends RuleException {

        private final static String ERROR_MESSAGE = "Length minimum ";

        public MinimumException(String message) {
            super(message);
        }

        public MinimumException() {
            super(ERROR_MESSAGE);
        }
    }
}
