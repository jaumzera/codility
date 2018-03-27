package br.com.joaomassan.codility.br.com.joaomassan.amazon.codility;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class EarliestValidHourTest {

    @Test
    public void testSolution() {
        EarliestValidHour instance = new EarliestValidHour();
        assertThat(instance.solution(1, 8, 3, 2, 6, 4), equalTo("12:36:48"));
        assertThat(instance.solution(0, 0, 1, 2, 3, 4), equalTo("00:12:34"));
        assertThat(instance.solution(0, 0, 0, 0, 8, 9), equalTo("00:08:09"));
        assertThat(instance.solution(0, 0, 0, 7, 8, 9), equalTo("07:08:09"));
        assertThat(instance.solution(2, 4, 5, 9, 5, 9), equalTo("NOT POSSIBLE"));
    }

}