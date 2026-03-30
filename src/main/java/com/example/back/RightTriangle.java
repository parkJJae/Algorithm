package com.example.back;

import java.util.Scanner;

public class RightTriangle {
    // 에이 제곱 플러스 비제곱은 씨제곱
    // 씨는 제일 큰 변이니까 맥스 값을 써야겠지
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();
            if(a==0 && b==0 && c==0)
                break;

            long[] triangle = {a, b, c};
            long add = 0;

            long max = triangle[0];
            for (int i = 0; i < triangle.length; i++) {
                if (max < triangle[i]) {
                    max = triangle[i];
                }
                add += triangle[i] * triangle[i];

            }
            if (add - (max * max) == (max * max)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }

}
