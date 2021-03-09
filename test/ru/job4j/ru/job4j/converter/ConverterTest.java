package ru.job4j.ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenrubleThenToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenrubleThenThreeDollar() {
        int ind = 180;
        int exeptedd = 3;
        int outd = Converter.rubleThreeDollar(ind);
        Assert.assertEquals(exeptedd, outd);
    }
}