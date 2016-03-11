package com.github.brkr.gandalf.rules;

import com.github.brkr.gandalf.Rule;
import com.github.brkr.gandalf.rules.exceptions.RuleException;

import org.apache.commons.validator.routines.UrlValidator;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 11/03/16.
 */
public class URLRule implements Rule {
    @Override
    public boolean execute(String value) throws RuleException {
        UrlValidator validator = UrlValidator.getInstance();
        if (validator.isValid(value))
            return true;
        else
            throw new URLValidationException();
    }

    private class URLValidationException extends RuleException {
        private static final String ERROR_MESSAGE = "URL address is wrong";

        public URLValidationException(){
            super(ERROR_MESSAGE);
        }

        public URLValidationException(String message) {
            super(message);
        }
    }


}
