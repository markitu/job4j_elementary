package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert180RblThen2Euro() {
        double input = 180;
        double expected = 2;
        double output = Converter.rubleToEuro(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert225RblThen3Dollars() {
        double input = 225;
        double expected = 3;
        double output = Converter.rubleToDollar(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert0RblThen0Euro() {
        double input = 0;
        double expected = 0.0;
        double output = Converter.rubleToEuro(input);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenConvert0RblThen0Dollar() {
        double input = 0;
        double expected = 0.0;
        double output = Converter.rubleToDollar(input);
        assertThat(output).isEqualTo(expected);
    }
}