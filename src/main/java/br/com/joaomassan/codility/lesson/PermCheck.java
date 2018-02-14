package br.com.joaomassan.codility.lesson;

import java.util.HashSet;
import java.util.Set;

class PermCheck {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= A.length; i++) {
            set.add(i);
        }

        for (int aA : A) {
            if (set.contains(aA)) {
                set.remove(aA);
            } else {
                set.add(aA);
            }
        }

        return set.size() == 0 ? 1 : 0;
    }
}