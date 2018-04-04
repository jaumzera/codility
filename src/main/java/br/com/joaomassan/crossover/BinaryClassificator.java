package br.com.joaomassan.crossover;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BinaryClassificator {

    static int[] rearrange(int[] elements) {
        Set<Integer> sorted = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String binary1 = Integer.toBinaryString(o1);
                String binary2 = Integer.toBinaryString(o2);
                int o1Ones = countOnes(binary1);
                int o2Ones = countOnes(binary2);
                if (o1Ones == o2Ones) {
                    return o1 - o2;
                } else {
                    return o1Ones - o2Ones;
                }
            }

            int countOnes(String binary) {
                return (int) Arrays.stream(binary.split(""))
                        .filter(item -> item.equals("1")).count();
            }
        });

        Arrays.stream(elements).forEach(sorted::add);
        return sorted.stream().mapToInt(Integer::intValue).toArray();
    }
}
