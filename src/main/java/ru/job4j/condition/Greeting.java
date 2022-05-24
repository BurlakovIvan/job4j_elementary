package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += "But I am a newbie. ";
        int year = 2022;
        idea += year;
        System.out.println(idea);
        short s = 1500;
        char c = (char) s;
        double d = c;
        System.out.println(d);
    }
}
