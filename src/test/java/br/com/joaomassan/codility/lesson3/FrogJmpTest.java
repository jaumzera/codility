package br.com.joaomassan.codility.lesson3;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrogJmpTest {

    @Test
    public void solutionTest() {
        FrogJmp frogJmp = new FrogJmp();
        assertEquals(3, frogJmp.solution(10, 85, 30));
        assertEquals(99, frogJmp.solution(0, 99, 1));
        assertEquals(1, frogJmp.solution(1, 100, 150));
    }
}