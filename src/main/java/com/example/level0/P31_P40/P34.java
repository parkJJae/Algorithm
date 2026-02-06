package com.example.level0.P31_P40;

/*
문자열 my_string이 매개변수로 주어집니다.
my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class P34 {
    public int solution(String my_string) {

        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {

            char ch = my_string.charAt(i);

            if (Character.isDigit(ch)) {
                answer += ch - '0';
            }
        }

        return answer;
    }
}
