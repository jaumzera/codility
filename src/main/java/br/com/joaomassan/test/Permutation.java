package br.com.joaomassan.test;

import java.util.Arrays;

public class Permutation {

    public void permutation(int[] array, int index) {
        if (index >= array.length) {
            System.out.println(Arrays.toString(array));
            return;
        }
l
        int aux;
        for (int i = index; i < array.length; i++) {
            aux = array[i];
            array[i] = array[index];
            array[index] = aux;
            permutation(array, i + 1);
            aux = array[i];
            array[i] = array[index];
            array[index] = aux;
        }
    }

    public static void main(String[] args) {
        new Permutation().permutation(new int[]{1, 2, 3, 4}, 0);
    }
}
