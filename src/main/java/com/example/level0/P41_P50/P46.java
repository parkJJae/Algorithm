package com.example.level0.P41_P50;

import java.util.Arrays;

/*
정수 배열 numbers가 매개변수로 주어집니다.
numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 */
public class P46 {
    public int solution(int[] numbers) {

        Arrays.sort(numbers);

        int n = numbers.length;

        int case1 = numbers[n - 1] * numbers[n - 2]; // 가장 큰 두개
        int case2 = numbers[0] * numbers[1];         // 가장 작은 두ro

        return Math.max(case1, case2);
    }
}
