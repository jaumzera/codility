package br.com.joaomassan.codility.lesson4;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public int solution(int[] A) {
        Set<Integer> elm = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            elm.add(A[i]);
        }

        int smallest = 1;
        while (true) {
            if (elm.contains(smallest)) {
                smallest++;
            } else {
                break;
            }
        }

        return smallest;
    }
}
