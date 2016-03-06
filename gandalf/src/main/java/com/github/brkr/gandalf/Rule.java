package com.github.brkr.gandalf;

import com.github.brkr.gandalf.rules.exceptions.RuleException;

/**
 * @Author :  berkergucur (brkr.gcr@gmail.com) - 06/03/16.
 */
public interface Rule {

    boolean execute(String value) throws RuleException;
}
