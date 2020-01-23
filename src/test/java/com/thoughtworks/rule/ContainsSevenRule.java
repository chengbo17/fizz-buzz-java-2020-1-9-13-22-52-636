package com.thoughtworks.rule;

public class ContainsSevenRule extends BaseRule {
    @Override
    public String say(int number) {
        boolean containsSeven = String.valueOf(number).contains(String.valueOf(7));

        if (!containsSeven) {
            return getNextRule().say(number);
        }

        StringBuilder words = new StringBuilder();
        if (number % 3 == 0) {
            words.append("Fizz");
        }
        if (number % 7 == 0) {
            words.append("Whizz");
        }
        return words.toString();
    }
}
