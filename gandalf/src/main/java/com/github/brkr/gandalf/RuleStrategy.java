package com.github.brkr.gandalf;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 07/03/16.
 */
public interface RuleStrategy {

    RuleDecorator min(int length);
    RuleDecorator max(int length);
    RuleDecorator email(String email);
    RuleDecorator ipAddress(String ipAddress);
}
