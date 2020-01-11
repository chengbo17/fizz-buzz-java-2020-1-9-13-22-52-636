package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_say_1_when_number_is_1(){
         String word = FizzBuzz.fizzBuzz(1);

        assertEquals(word, "1");
    }

    @Test
    public void should_say_2_when_number_is_2(){
        String word = FizzBuzz.fizzBuzz(2);

        assertEquals(word, "2");
    }

    @Test
    public void should_say_Fizz_when_number_is_the_multiple_of_3(){
        assertEquals(FizzBuzz.fizzBuzz(3), "Fizz");
        assertEquals(FizzBuzz.fizzBuzz(6), "Fizz");
    }

    @Test
    public void should_say_Buzz_when_number_is_the_multiple_of_5(){
        assertEquals(FizzBuzz.fizzBuzz(5), "Buzz");
        assertEquals(FizzBuzz.fizzBuzz(10), "Buzz");
    }

    @Test
    public void should_say_Whizz_when_number_is_the_multiple_of_7(){
        assertEquals(FizzBuzz.fizzBuzz(7), "Whizz");
        assertEquals(FizzBuzz.fizzBuzz(14), "Whizz");
    }

    @Test
    public void should_say_FizzBuzz_when_number_is_the_multiple_of_3_and_5(){
        assertEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz");
    }

    @Test
    public void should_say_FizzWhizz_when_number_is_the_multiple_of_3_and_7(){
        assertEquals(FizzBuzz.fizzBuzz(21), "FizzWhizz");
    }

    @Test
    public void should_say_BuzzWhizz_when_number_is_the_multiple_of_5_and_7(){
        assertEquals(FizzBuzz.fizzBuzz(35), "BuzzWhizz");
    }

    @Test
    public void should_say_FizzBuzzWhizz_when_number_is_the_multiple_of_3_and_5_and_7(){
        assertEquals(FizzBuzz.fizzBuzz(105), "FizzBuzzWhizz");
    }

    @Test
    public void should_say_Fizz_when_number_contains_3(){
        assertEquals(FizzBuzz.fizzBuzz(13), "Fizz");
    }
}
