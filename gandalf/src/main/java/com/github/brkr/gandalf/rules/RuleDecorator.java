package com.github.brkr.gandalf.rules;

import com.github.brkr.gandalf.Rule;
import com.github.brkr.gandalf.RuleStrategy;

import java.util.List;

/**
 * @author :  berkergucur (brkr.gcr@gmail.com) - 09/03/16.
 */
public class RuleDecorator implements RuleStrategy {

    protected List<Rule> rules;
    /**
     *
     * @param length min size of length
     */
    @Override
    public RuleDecorator min(int length){
        rules.add(new MinimumLength(length));
        return this;
    }

    @Override
    public RuleDecorator max(int length) {
        rules.add(new MaximumLength(length));
        return this;
    }

    @Override
    public RuleDecorator email(String email) {
        rules.add(new EmailRule());
        return this;
    }
}
