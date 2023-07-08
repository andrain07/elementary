package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SelectedSorterTest {
    @Test
    public void whenSortArrayWithLength5() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SelectedSorter.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayWithLength3() {
        int[] data = new int[]{3, 4, 1};
        int[] result = SelectedSorter.sort(data);
        int[] expected = new int[]{1, 3, 4};
        assertThat(result).containsExactly(expected);
    }
}