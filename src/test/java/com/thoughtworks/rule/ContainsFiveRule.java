package com.thoughtworks.rule;

public class ContainsFiveRule extends BaseRule {
    @Override
    public String say(int number) {
        boolean containsFive = String.valueOf(number).contains(String.valueOf(5));
        if (!containsFive) {
            return getNextRule().say(number);
        }

        StringBuilder words = new StringBuilder();
        if (number % 3 == 0) {
            words.append("Fizz");
        }
        words.append("Buzz");
        if (number % 7 == 0) {
            words.append("Whizz");
        }
        return words.toString();
    }
}
