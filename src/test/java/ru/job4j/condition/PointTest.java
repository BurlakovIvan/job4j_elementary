package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point pointFirst = new Point(0, 0);
        Point pointSecond = new Point(2, 0);
        double out = pointFirst.distance(pointSecond);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to158then17() {
        double expected = 17;
        Point pointFirst = new Point(0, 0);
        Point pointSecond = new Point(15, 8);
        double out = pointFirst.distance(pointSecond);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when18to204then19dot416() {
        double expected = 19.416;
        Point pointFirst = new Point(1, 8);
        Point pointSecond = new Point(20, 4);
        double out = pointFirst.distance(pointSecond);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1080to20045then193dot196() {
        double expected = 193.196;
        Point pointFirst = new Point(10, 80);
        Point pointSecond = new Point(200, 45);
        double out = pointFirst.distance(pointSecond);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123toMinus7Minus24then9() {
        double expected = 9.0;
        Point pointFirst = new Point(1, 2, 3);
        Point pointSecond = new Point(-7, -2, 4);
        double out = pointFirst.distance(pointSecond);
        Assert.assertEquals(expected, out, 0.1);
    }
}