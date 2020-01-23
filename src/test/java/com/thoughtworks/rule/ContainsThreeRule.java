package com.thoughtworks.rule;

public class ContainsThreeRule extends BaseRule {
    @Override
    public String say(int number) {
        if (String.valueOf(number).contains(String.valueOf(3))){
            return "Fizz";
        }
        return getNextRule().say(number);
    }
}
