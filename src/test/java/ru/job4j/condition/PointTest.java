package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to158then17() {
        double expected = 17;
        int x1 = 0;
        int y1 = 0;
        int x2 = 15;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when18to204then19dot416() {
        double expected = 19.416;
        int x1 = 1;
        int y1 = 8;
        int x2 = 20;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1080to20045then193dot196() {
        double expected = 193.196;
        int x1 = 10;
        int y1 = 80;
        int x2 = 200;
        int y2 = 45;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}