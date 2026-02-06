package com.example.level0.P31_P40;

/*
문자열 my_string이 매개변수로 주어질 때,
대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
 */
public class P36 {
    public String solution(String my_string) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {

            char ch = my_string.charAt(i);

            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }

        return sb.toString();
    }
}
