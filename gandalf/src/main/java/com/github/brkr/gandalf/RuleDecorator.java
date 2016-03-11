package com.github.brkr.gandalf;

import com.github.brkr.gandalf.rules.EmailRule;
import com.github.brkr.gandalf.rules.IPAddress;
import com.github.brkr.gandalf.rules.MaximumLength;
import com.github.brkr.gandalf.rules.MinimumLength;
import com.github.brkr.gandalf.rules.URLRule;

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

    /**
     *
     * @param ipAddress IPV4 address
     * @return
     */
    @Override
    public RuleDecorator ipAddress(String ipAddress) {
        rules.add(new IPAddress());
        return this;
    }

    @Override
    public RuleDecorator url(String rule) {
        rules.add(new URLRule());
        return this;
    }
}
