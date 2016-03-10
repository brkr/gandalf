package com.github.brkr.gandalf.rules;

import com.github.brkr.gandalf.Rule;
import com.github.brkr.gandalf.rules.exceptions.RuleException;

import org.apache.commons.validator.routines.InetAddressValidator;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 10/03/16.
 */
public class IPAddress implements Rule {

    @Override
    public boolean execute(String value) throws RuleException {
        InetAddressValidator validator = InetAddressValidator.getInstance();
        if (validator.isValid(value))
            return true;
        else
            throw new IPAddressValidationException();
    }


    private class IPAddressValidationException extends RuleException {


        private static final String ERROR_MESSAGE = "Ip address wrong";

        public IPAddressValidationException(){
            super(ERROR_MESSAGE);
        }

        public IPAddressValidationException(String message) {
            super(message);
        }
    }
}
