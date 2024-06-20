package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenManHeightIs187ThenWeightIs100Dot05() {
        double height = 187;
        double expected = 100.05;
        double actual = Fit.manWeight(height);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenWomanHeightIs187ThenWeightIs88Dot55() {
        double height = 187;
        double expected = 88.55;
        double actual = Fit.womanWeight(height);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenHeightIsZeroThenThrowIllegalArgumentExceptionForMan() {
        double height = 0;
        Assert.assertThrows(IllegalArgumentException.class, () -> Fit.manWeight(height));
    }

    @Test
    public void whenHeightIsZeroThenThrowIllegalArgumentExceptionForWoman() {
        double height = 0;
        Assert.assertThrows(IllegalArgumentException.class, () -> Fit.womanWeight(height));
    }

    @Test
    public void whenHeightIsNegativeThenThrowIllegalArgumentExceptionForMan() {
        double height = -150;
        Assert.assertThrows(IllegalArgumentException.class, () -> Fit.manWeight(height));
    }

    @Test
    public void whenHeightIsNegativeThenThrowIllegalArgumentExceptionForWoman() {
        double height = -150;
        Assert.assertThrows(IllegalArgumentException.class, () -> Fit.womanWeight(height));
    }
}