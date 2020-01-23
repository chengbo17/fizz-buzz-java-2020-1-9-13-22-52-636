package com.thoughtworks.rule;

public class MultiplesRule extends BaseRule {
    @Override
    public String say(int number) {
        StringBuilder words = new StringBuilder();
        if (number % 3 == 0){
            words.append("Fizz");
        }
        if (number % 5 == 0){
            words.append("Buzz");
        }
        if (number % 7 == 0){
            words.append("Whizz");
        }
        return words.length() != 0 ? words.toString() : getNextRule().say(number);


    }
}
