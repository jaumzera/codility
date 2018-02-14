package br.com.joaomassan.codility.lesson2;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class OddElementsArray {

    public int solution(int[] A) {
        Set<Integer> elements = new HashSet<>();
        IntStream.of(A).forEach(elm -> {
            if (elements.contains(elm)) {
                elements.remove(elm);
            } else {
                elements.add(elm);
            }
        });

        return elements.iterator().next();
    }
}
