package com.example.level0.P41_P50;

/*
정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class P50 {
    public int[] solution(int[] array) {

        int max = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return new int[]{max, index};
    }
}
