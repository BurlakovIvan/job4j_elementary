package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To22Then22() {
        int left = 10;
        int right = 22;
        int result = Max.max(left, right);
        int expected = 22;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To7Then10() {
        int left = 10;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOf584Then8() {
        int first = 5;
        int second = 8;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax6394Then9() {
        int first = 6;
        int second = 3;
        int third = 9;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax55321Then5() {
        int first = 5;
        int second = 5;
        int third = 3;
        int fourth = 2;
        int fifth = 1;
        int result = Max.max(first, second, third, fourth, fifth);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

}