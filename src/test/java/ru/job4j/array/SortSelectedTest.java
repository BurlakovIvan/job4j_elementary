package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {10, 8, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {8, 9, 10};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5AnElements() {
        int[] data = new int[] {12, 10, 11, 14, 13};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 11, 12, 13, 14};
        assertArrayEquals(expected, result);
    }
}