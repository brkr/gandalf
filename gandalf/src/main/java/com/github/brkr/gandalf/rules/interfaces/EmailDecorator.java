package com.github.brkr.gandalf.rules.interfaces;

import com.github.brkr.gandalf.RuleDecorator;

/**
 * Created by berker - berker.gucur@uitsec.com
 * on 14.06.2016.
 */
public interface EmailDecorator extends BaseRule {
    EmailDecorator email(String email);
}
