package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSortSize5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortSize3() {
        int[] data = new int[] {6, 200, 101};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 101, 200};
        assertThat(result).containsExactly(expected);
    }

}