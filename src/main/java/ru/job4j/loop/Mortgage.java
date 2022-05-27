package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        amount += amount * percent / 100;
        while (amount > salary) {
            year++;
            amount -= salary + (amount - salary) * percent / 100;
        }
        return year;
    }
}
