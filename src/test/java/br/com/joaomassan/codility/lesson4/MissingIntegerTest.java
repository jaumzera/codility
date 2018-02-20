package br.com.joaomassan.codility.lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingIntegerTest {

    @Test
    public void solution() {
        MissingInteger missingInteger = new MissingInteger();
        assertEquals(5, missingInteger.solution(new int[] {1, 3, 6, 4, 1, 2}));
    }
}