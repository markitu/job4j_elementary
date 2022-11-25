package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap4to5() {
        int[] input = {11, 23, 31, 4, 0, 99, 100500, 7, 44};
        int source = 4;
        int dest = input.length - 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {11, 23, 31, 4, 99, 0, 100500, 7, 44};
        assertThat(result).containsExactly(expected);
    }
}