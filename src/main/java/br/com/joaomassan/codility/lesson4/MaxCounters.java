package br.com.joaomassan.codility.lesson4;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int currentMax = 0;
        int lastUpdate = 0;
        int shouldApplyMax = N + 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == shouldApplyMax) {
                lastUpdate = currentMax;
            } else {
                int pos = A[i] - 1;
                counters[pos] = counters[pos] > lastUpdate
                        ? counters[pos] + 1
                        : lastUpdate + 1;

                if (counters[pos] > currentMax) {
                    currentMax = counters[pos];
                }
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < lastUpdate) {
                counters[i] = lastUpdate;
            }
        }

        return counters;

    }
}
