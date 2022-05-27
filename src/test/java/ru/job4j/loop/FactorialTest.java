package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int n = 1;
        int result = Factorial.calc(n);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForThreeThenSix() {
        int n = 3;
        int result = Factorial.calc(n);
        int expected = 6;
        assertEquals(expected, result);
    }
}