package com.github.brkr.gandalf;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 07/03/16.
 */
public interface RuleStrategy {

    RuleDecorator min(int length);
    RuleDecorator max(int length);
    RuleDecorator ipAddress(String ipAddress);
    RuleDecorator url(String rule);
    RuleDecorator hasUpperCase(String value);
    RuleDecorator hasLowerCase(String value);
}
