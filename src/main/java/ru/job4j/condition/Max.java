package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }

    public static int max(int first, int second, int third, int fourth, int fifth) {
        return max(first, max(second, third, fourth, fifth));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(10, 20));
        System.out.println(Max.max(5, 1));
        System.out.println(Max.max(7, 7));

    }
}
