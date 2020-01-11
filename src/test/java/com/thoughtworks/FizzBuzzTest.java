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
}
