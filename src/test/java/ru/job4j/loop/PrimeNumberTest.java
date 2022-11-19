package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PrimeNumberTest {

    @Test
    public void when5() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when11() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when2() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when99() {
        int finish = 99;
        int result = PrimeNumber.calc(finish);
        int expected = 25;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when100() {
        int finish = 100;
        int result = PrimeNumber.calc(finish);
        int expected = 25;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when101() {
        int finish = 101;
        int result = PrimeNumber.calc(finish);
        int expected = 26;
        assertThat(result).isEqualTo(expected);
    }
}