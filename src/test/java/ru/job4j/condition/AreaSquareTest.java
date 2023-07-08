package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class AreaSquareTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = AreaSquare.calculateSquare(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K5Square0dot55() {
        int p = 4;
        double k = 5;
        double expected = 0.55;
        double out = AreaSquare.calculateSquare(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K2Square0dot5dot55() {
        int p = 10;
        double k = 2;
        double expected = 5.55;
        double out = AreaSquare.calculateSquare(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}