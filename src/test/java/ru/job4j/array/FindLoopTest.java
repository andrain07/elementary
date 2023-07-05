package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] arr = new int[]{1, 2, 3};
        int elem = 5;
        int result = FindLoop.indexOf(arr, elem);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}