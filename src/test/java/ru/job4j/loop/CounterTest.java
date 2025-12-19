package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    public void whenSumFromOneToTenThenFiftyFive() {
        int start = 1;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumFromThreeToEightThenThirtyThree() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumFromZeroToZeroThenZero() {
        int start = 0;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumFromElevenToFiveThenZero() {
        int start = 11;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromElevenToFortyFourThenThirty() {
        int start = 11;
        int finish = 44;
        int result = Counter.sumByEven(start, finish);
        int expected = 476;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusTenToTwelveThenTwelve() {
        int start = -10;
        int finish = 12;
        int result = Counter.sumByEven(start, finish);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

}