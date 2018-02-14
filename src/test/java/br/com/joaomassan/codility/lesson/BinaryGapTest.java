package br.com.joaomassan.codility.lesson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class BinaryGapTest {

    @Test
    public void solutionTest() {
        System.out.println("> BinaryGap");
        BinaryGap binaryGap = new BinaryGap();
        int[] numbers = new int[]{6, 100, 110, 200328, 200, 4150, 111, 2013};
        int[] gaps = new int[numbers.length];
        int[] expected = new int[]{1, 2, 1, 4, 3, 6, 1, 1};

        for (int i = 0; i < numbers.length; i++) {
            gaps[i] = binaryGap.solution(numbers[i]);
            String binary = Integer.toString(numbers[i], 2);
            System.out.println("Gap of " + binary + " is " + gaps[i]);
            assertEquals(expected[i], gaps[i]);
        }

        System.out.println("< BinaryGap");
    }

}