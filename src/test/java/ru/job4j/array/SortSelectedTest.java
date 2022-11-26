package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5digits() {
        int[] data = new int[] {0, 23, 3999, -11, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-11, 0, 5, 23, 3999};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3digits() {
        int[] data = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        assertThat(result).containsExactly(expected);
    }
}