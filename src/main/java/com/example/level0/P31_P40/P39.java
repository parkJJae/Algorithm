package com.example.level0.P31_P40;
/*
정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class P39 {
    public int[] solution(int n) {

        int size = (n + 1) / 2;
        int[] answer = new int[size];

        int index = 0;

        for (int i = 1; i <= n; i += 2) {
            answer[index++] = i;
        }

        return answer;
    }
}
