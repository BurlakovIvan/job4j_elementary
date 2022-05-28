package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to4() {
        int[] input = {5, 1, 2, 3, 0, 4};
        int source = 0;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 1, 2, 3, 5, 4};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap5to6() {
        int[] input = {1, 2, 3, 4, 5, 8, 7};
        int source = 5;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 5, 7, 8};
        assertArrayEquals(expected, result);
    }
}