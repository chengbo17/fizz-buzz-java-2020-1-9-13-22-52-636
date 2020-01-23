package com.thoughtworks.rule;

public class DefaultRule extends BaseRule {
    @Override
    public String say(int number) {
        return String.valueOf(number);
    }
}
