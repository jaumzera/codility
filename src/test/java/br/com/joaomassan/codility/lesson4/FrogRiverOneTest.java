package br.com.joaomassan.codility.lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrogRiverOneTest {

    @Test
    public void testSolution() {
        FrogRiverOne solution = new FrogRiverOne();
        assertEquals(6, solution.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        assertEquals(-1, solution.solution(2, new int[]{2, 2, 2, 2, 2}));
    }
}