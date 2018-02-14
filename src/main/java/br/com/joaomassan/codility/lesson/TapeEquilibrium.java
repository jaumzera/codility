package br.com.joaomassan.codility.lesson;

public class TapeEquilibrium {

    public int solution(int[] A) {
        //int total = IntStream.of(A).reduce((sum, i) -> sum + i).getAsInt();

        int total = 0;
        for(int i = 0; i < A.length; i++) {
            total += A[i];
        }

        int firstPart = 0;
        int diff;
        Integer min = null;

        for (int i = 0; i < A.length - 1; i++) {
            firstPart += A[i];
            diff = firstPart - (total - firstPart);
            diff = diff < 0 ? diff * -1 : diff;

            if (min == null) {
                min = diff;
            } else if (diff < min) {
                min = diff;
            }
        }
        return min;
    }
}
