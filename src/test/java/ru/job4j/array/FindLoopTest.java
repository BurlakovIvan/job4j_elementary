package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {1, 8, 7, 15, 47};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot15ThenMinus3() {
        int[] data = {1, 8, 7, 15, 47};
        int el = 15;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas10Then4() {
        int[] data = new int[]{1, 7, 8, 2, 10};
        int el = 10;
        int start = 3;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonNoHas1ThenNo() {
        int[] data = new int[]{1, 7, 8, 9, 2};
        int el = 2;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertEquals(expected, result);
    }
}