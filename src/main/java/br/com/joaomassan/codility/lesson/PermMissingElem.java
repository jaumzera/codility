package br.com.joaomassan.codility.lesson;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {

    public int solution(int[] A) {
        if(A.length == 0) {
            return 1;
        }

        Set<Integer> values = new HashSet<>();
        for (int item : A) {
            values.add(item);
        }

        for(int i = 1; i <= A.length + 1; i++) {
            if(values.contains(i)) {
                values.remove(i);
            } else {
                values.add(i);
            }
        }

        return values.iterator().next();
    }
}
