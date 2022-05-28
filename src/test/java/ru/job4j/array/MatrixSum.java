package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] numout : array) {
            for (int numin : numout) {
                rsl += numin;
            }
        }
        return rsl;
    }
}
