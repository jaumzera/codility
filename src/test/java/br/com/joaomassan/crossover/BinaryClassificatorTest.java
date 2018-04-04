package br.com.joaomassan.crossover;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class BinaryClassificatorTest {

    @Test
    public void test() {
        assertThat(Arrays.toString(
                BinaryClassificator.rearrange(new int[]{3, 1, 2, 3})),
                equalTo("[1, 2, 3]"));

        assertThat(Arrays.toString(
                BinaryClassificator.rearrange(new int[]{5, 5, 3, 7, 10, 14})),
                equalTo("[3, 5, 10, 7, 14]"));
    }

}