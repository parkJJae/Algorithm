package com.example.level0.P11_P20;
/*
정수 배열 numbers가 매개변수로 주어집니다.
numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 */
public class P17 {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max2 = max;
                max = numbers[i];
            } else if (numbers[i] > max2) {
                max2 = numbers[i];
            }
        }
        return max * max2;
    }
}
