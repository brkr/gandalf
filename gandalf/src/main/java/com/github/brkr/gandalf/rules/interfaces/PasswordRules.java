package com.github.brkr.gandalf.rules.interfaces;

import android.widget.EditText;

/**
 * Created by berker - berker.gucur@uitsec.com
 * on 14.06.2016.
 */
public interface PasswordRules extends BaseRule {
    PasswordRules password(String value);
    PasswordRules confirmField(EditText confirm);
}
