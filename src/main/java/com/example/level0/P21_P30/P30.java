package com.example.level0.P21_P30;

/*
문자열 my_string과 문자 letter이 매개변수로 주어집니다.
my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class P30 {
    public String solution(String my_string, String letter) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {

            String ch = String.valueOf(my_string.charAt(i));

            if (!ch.equals(letter)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
