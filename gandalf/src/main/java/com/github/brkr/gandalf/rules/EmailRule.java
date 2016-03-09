package com.github.brkr.gandalf.rules;

import com.github.brkr.gandalf.Rule;
import com.github.brkr.gandalf.rules.exceptions.RuleException;

import org.apache.commons.validator.routines.EmailValidator;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 09/03/16.
 */
public class EmailRule implements Rule {


    @Override
    public boolean execute(String value) throws RuleException {
        EmailValidator validator = EmailValidator.getInstance();
        if (validator.isValid(value))
            return true;
        else
            throw new EmailValidationException();
    }

    public class EmailValidationException extends RuleException {

        private final static String ERROR_MESSAGE = "Length maximum";


        public EmailValidationException(String message) {
            super(message);
        }

        public EmailValidationException() {
            super(ERROR_MESSAGE);
        }

    }
}
