package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to00then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double expected = 0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when77to99then2dot82() {
        Point a = new Point(7, 7);
        Point b = new Point(9, 9);
        double expected = 2.82;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus7minus7to48then18dot6() {
        Point a = new Point(-7, -7);
        Point b = new Point(4, 8);
        double expected = 18.6;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPlus7minus7toMinus4plus8then18dot6() {
        Point a = new Point(7, -7);
        Point b = new Point(-4, 8);
        double expected = 18.6;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}