package br.com.joaomassan.codility.lesson4;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MaxCountersTest {

    @Test
    public void solution() {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        MaxCounters solution = new MaxCounters();
        String answer = Arrays.toString(solution.solution(N, A));
        assertEquals("[3, 2, 2, 4, 2]", answer);

        A = new int[0];
        N = 0;
        answer = Arrays.toString(solution.solution(N, A));
        assertEquals("[]", answer);

        A = new int[] {2, 1};
        N = 2;
        answer = Arrays.toString(solution.solution(N, A));
        assertEquals("[1, 1]", answer);
    }
}