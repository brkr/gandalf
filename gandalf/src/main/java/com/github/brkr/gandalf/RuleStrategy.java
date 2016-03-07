package com.github.brkr.gandalf;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 07/03/16.
 */
public interface RuleStrategy {

    RuleStrategy min(int length);
    RuleStrategy max(int length);
}
