package br.com.joaomassan.codility.lesson;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int[] newA = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            newA[(i + K) % A.length] = A[i];
        }
        return newA;
    }
}
