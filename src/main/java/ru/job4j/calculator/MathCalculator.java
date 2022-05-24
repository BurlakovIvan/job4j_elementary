package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double difAndDivide(double first, double second) {
        return difference(first, second)
                + divide(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + difference(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("1. Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("2. Результат расчета равен: " + difAndDivide(10, 20));
        System.out.println("3. Результат расчета равен: " + sumAll(10, 20));
    }
}
