package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(2, 0);
        double out = startPoint.getDistance(endPoint);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to58then4dot47() {
        Point startPoint = new Point(3, 4);
        Point endPoint = new Point(5, 8);
        double out = startPoint.getDistance(endPoint);
        double expected = 4.47;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to06then3dot16() {
        Point startPoint = new Point(1, 3);
        Point endPoint = new Point(0, 6);
        double out = startPoint.getDistance(endPoint);
        double expected = 3.16;
        Assert.assertEquals(expected, out, 0.01);
    }
}
