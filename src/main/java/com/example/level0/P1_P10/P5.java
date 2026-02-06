package com.example.level0.P1_P10;
/*
정수 num1과 num2가 매개변수로 주어질 때,
num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.
 */
public class P5 {
    public int solution(int num1, int num2) {

        double mod = 0.0;
        int answer = 0;
        mod = (double)num1 / (double)num2 * 1000;
        answer = (int)mod;
        return answer;
    }
}
