package br.com.joaomassan.crossover;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class BalanceStringTest {

    @Test
    public void test() {
        assertThat(
                Arrays.toString(
                        BalanceString.balancedOrNot(
                                new String[]{"<>>>", "<>>>>"}, new int[]{2, 2})),
                equalTo("[1, 0]"));

        assertThat(
                Arrays.toString(
                        BalanceString.balancedOrNot(
                                new String[]{"<<>>", "<>"}, new int[]{2, 2})),
                equalTo("[1, 1]"));
    }

}