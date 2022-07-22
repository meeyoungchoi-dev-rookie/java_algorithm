package 프로그래머스.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long num = scanner.nextLong();
        Long answer = solution(num);
        System.out.println(answer);
    }

    public static long solution(long n) {
       String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        return Long.parseLong(sb.toString());
    }
}
