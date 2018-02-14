package br.com.joaomassan.codility.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class OddElementsArrayTest {

    @Test
    public void solutionTest() {
        System.out.println("> OddElementsArray");
        OddElementsArray solution = new OddElementsArray();
        assertEquals(1, solution.solution(new int[]{1, 2, 2, 3, 3, 4, 4}));
        assertEquals(1, solution.solution(new int[]{1}));
        assertEquals(0, solution.solution(new int[]{1, 2, 2, 3, 0, 3, 4, 4, 1}));
        System.out.println("< OddElementsArray");
    }
}