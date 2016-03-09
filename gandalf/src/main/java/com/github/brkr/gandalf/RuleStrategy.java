package com.github.brkr.gandalf;

import com.github.brkr.gandalf.rules.RuleDecorator;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 07/03/16.
 */
public interface RuleStrategy {

    RuleDecorator min(int length);
    RuleDecorator max(int length);
    RuleDecorator email(String email);
}
