package br.com.joaomassan.codility.lesson;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CyclicRotationTest {

    @Test
    void solutionTest() {
        System.out.println("> CyclicRotation");
        CyclicRotation cyclicRotation = new CyclicRotation();

        String expected = "[4, 1, 2, 3]";
        String actual = Arrays.toString(cyclicRotation.solution(new int[]{1, 2, 3, 4}, 1));
        assertEquals(expected, actual);

        expected = "[3, 4, 1, 2]";
        actual = Arrays.toString(cyclicRotation.solution(new int[]{1, 2, 3, 4}, 2));
        assertEquals(expected, actual);

        expected = "[2, 3, 4, 1]";
        actual = Arrays.toString(cyclicRotation.solution(new int[]{1, 2, 3, 4}, 3));
        assertEquals(expected, actual);

        expected = "[1, 2, 3, 4]";
        actual = Arrays.toString(cyclicRotation.solution(new int[]{1, 2, 3, 4}, 4));
        assertEquals(expected, actual);

        expected = "[]";
        actual = Arrays.toString(cyclicRotation.solution(new int[0], 100));
        assertEquals(expected, actual);

        expected = "[1]";
        actual = Arrays.toString(cyclicRotation.solution(new int[]{1}, 100));
        assertEquals(expected, actual);


        System.out.println("< CyclicRotation");
    }

}