package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void print(int num) {
        System.out.print(num + ": ");
        System.out.print(isEven(num));
        System.out.print(" ");
        System.out.print(isPositive(num));
        System.out.print(" ");
        System.out.print(notEven(num));
        System.out.print(" ");
        System.out.print(notPositive(num));
        System.out.print(" ");
        System.out.print(notEvenAndPositive(num));
        System.out.print(" ");
        System.out.println(evenOrNotPositive(num));
    }

    public static void main(String[] args) {
        print(2);
        print(-2);
        print(1);
        print(-1);
    }
}
