package br.com.joaomassan.codility.lesson3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TapeEquilibriumTest {

    @Test
    public void solutionTest() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        assertEquals(1, tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
        assertEquals(2000, tapeEquilibrium.solution(new int[]{-1000, 1000}));
        assertEquals(0, tapeEquilibrium.solution(new int[]{1, 1}));
    }
}