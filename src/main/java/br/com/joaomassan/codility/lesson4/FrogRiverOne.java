package br.com.joaomassan.codility.lesson4;


import java.util.HashSet;
import java.util.Set;

class FrogRiverOne {
    public int solution(int X, int[] A) {
        Set<Integer> path = new HashSet<>();
        for(int i = 0; i < A.length; i++) {
            if(A[i] <= X) {
                path.add(A[i]);
            }

            if(path.size() == X) {
                return i;
            }
        }
        return -1;
    }
}