package com.github.brkr.gandalf.rules.exceptions;

/**
 * @Author :  berkergucur (brkr.gcr@gmail.com) - 06/03/16.
 */
public class MinimumException extends RuleException {

    private final static String ERROR_MESSAGE = "Length minimum ";

    public MinimumException(String message) {
        super(message);
    }

    public MinimumException() {
        super(ERROR_MESSAGE);
    }
}
