package br.com.joaomassan.codility.lesson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermCheckTest {

    @Test
    public void solution() {
        PermCheck solution = new PermCheck();
        assertEquals(1, solution.solution(new int[]{4, 1, 2, 3}));
        assertEquals(0, solution.solution(new int[]{4, 1, 3}));
        assertEquals(1, solution.solution(new int[]{4, 5, 1, 2, 3}));
        assertEquals(0, solution.solution(new int[]{1, 4, 1}));
    }
}