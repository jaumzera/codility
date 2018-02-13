package br.com.joaomassan.codility.lesson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddElementsArrayTest {

    @Test
    public void solutionTest() {
        System.out.println("> OddElementsArray");
        OddElementsArray solution = new OddElementsArray();
        Assertions.assertEquals(1, solution.solution(new int[]{1, 2, 2, 3, 3, 4, 4}));
        Assertions.assertEquals(1, solution.solution(new int[]{1}));
        Assertions.assertEquals(0, solution.solution(new int[]{1, 2, 2, 3, 0, 3, 4, 4, 1}));
        System.out.println("< OddElementsArray");
    }
}