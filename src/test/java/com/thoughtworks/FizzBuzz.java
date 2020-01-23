package com.thoughtworks;

import com.thoughtworks.rule.ContainsFiveRule;
import com.thoughtworks.rule.ContainsThreeRule;
import com.thoughtworks.rule.DefaultRule;
import com.thoughtworks.rule.MultiplesRule;

public class FizzBuzz {

    public static String fizzBuzz(int number){
        return getRule().say(number);
    }

    private static Rule getRule(){
        ContainsFiveRule containsFiveRule = new ContainsFiveRule();
        ContainsThreeRule containsThreeRule = new ContainsThreeRule();
        MultiplesRule multiplesRule = new MultiplesRule();
        DefaultRule defaultRule = new DefaultRule();

        containsFiveRule.setNextRule(containsThreeRule);
        containsThreeRule.setNextRule(multiplesRule);
        multiplesRule.setNextRule(defaultRule);
        return containsFiveRule;
    }
}
