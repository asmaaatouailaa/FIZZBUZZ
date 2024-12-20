package com.nomChoisi.FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test  // Mark this method as a test case
    public void shouldReturn1WhenNumberIs1() {
        // Given
        String expectedResult = "1";

        // When
        String result = FizzBuzz.FizzBuzznb(1);

        // Then
        assertEquals(expectedResult, result);
    }
    @Test  // Mark this method as a test case
    public void shouldReturn1WhenNumberIs2() {
        // Given
        String expectedResult = "2";

        // When
        String result = FizzBuzz.FizzBuzznb(2);

        // Then
        assertEquals(expectedResult, result);
    }

    @Test  // Mark this method as a test case
    public void shouldReturn1WhenNumberIs3() {
        // Given
        String expectedResult = "FIZZ";

        // When
        String result = FizzBuzz.FizzBuzznb(3);

        // Then
        assertEquals(expectedResult, result);
    }
    @Test  // Mark this method as a test case
    public void shouldReturn1WhenNumberIs4() {
        // Given
        String expectedResult = "4";

        // When
        String result = FizzBuzz.FizzBuzznb(4);

        // Then
        assertEquals(expectedResult, result);
    }

    @Test  // Mark this method as a test case
    public void shouldReturn1WhenNumberIs5() {
        // Given
        String expectedResult = "BUZZ";

        // When
        String result = FizzBuzz.FizzBuzznb(5);

        // Then
        assertEquals(expectedResult, result);
    }
    @Test  // Mark this method as a test case
    public void shouldReturn1WhenNumberIs15() {
        // Given
        String expectedResult = "FIZZBUZZ";

        // When
        String result = FizzBuzz.FizzBuzznb(15);

        // Then
        assertEquals(expectedResult, result);
    }

}