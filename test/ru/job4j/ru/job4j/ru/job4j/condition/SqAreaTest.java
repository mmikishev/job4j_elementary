package ru.job4j.ru.job4j.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = ru.job4j.condition.SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void square1() {
        int expected = 0;
        int p = 3;
        int k = 1;
        double out = ru.job4j.condition.SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void square2() {
        int expected = 4;
        int p = 12;
        int k = 4;
        double out = ru.job4j.condition.SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}