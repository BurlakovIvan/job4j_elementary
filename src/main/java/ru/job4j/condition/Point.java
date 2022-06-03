package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point pointFirst = new Point(0, 0);
        Point pointSecond = new Point(2, 0);
        double result = pointFirst.distance(pointSecond);
        System.out.println("result (0, 0) to (2, 0) " + result);
        pointFirst = new Point(0, 0);
        pointSecond = new Point(15, 8);
        result = pointFirst.distance(pointSecond);
        System.out.println("result (0, 0) to (15, 8) " + result);
        pointFirst = new Point(1, 8);
        pointSecond = new Point(20, 4);
        result = pointFirst.distance(pointSecond);
        System.out.println("result (1, 8) to (20, 4) " + result);
        pointFirst = new Point(10, 80);
        pointSecond = new Point(200, 45);
        result = pointFirst.distance(pointSecond);
        System.out.println("result (10, 80) to (200, 45) " + result);
        pointFirst = new Point(1, 2, 3);
        pointSecond = new Point(-7, -2, 4);
        result = pointFirst.distance(pointSecond);
        System.out.println("result (1, 2, 3) to (-7, -2, 4) " + result);
    }
}
