package com.example.level0.P41_P50;

/*
문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 */
public class P48 {
    public String solution(String my_string, int num1, int num2) {

        char[] arr = my_string.toCharArray();

        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

        return new String(arr);
    }
}
