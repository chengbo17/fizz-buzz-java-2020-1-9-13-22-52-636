package com.thoughtworks;

public class FizzBuzz {

    public static String fizzBuzz(int number){
        boolean isContains5 = isContains(number, 5);
        if (!isContains5 && isContains(number, 3)){
            return "Fizz";
        }
        if ((!isContains5 && number % 3 == 0) && number % 5 ==0 && number % 7 == 0){
            return "FizzBuzzWhizz";
        }
        if ((!isContains5 && number % 3 == 0) && number % 7 == 0){
            return "FizzWhizz";
        }
        if ((!isContains5 && number % 3 == 0) && number % 5 == 0){
            return "FizzBuzz";
        }
        if (number % 5 == 0 && number % 7 == 0){
            return "BuzzWhizz";
        }
        if (!isContains5 && number % 3 == 0){
            return "Fizz";
        }
        if (number % 5 == 0){
            return "Buzz";
        }
        if(number % 7 == 0){
            return "Whizz";
        }
        return String.valueOf(number);
    }

    private static boolean isContains(int number, int n) {
        return String.valueOf(number).contains(String.valueOf(n));
    }
}
