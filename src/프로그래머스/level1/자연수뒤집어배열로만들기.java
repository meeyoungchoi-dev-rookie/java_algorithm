package 프로그래머스.level1;

import java.util.Scanner;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long num = Long.valueOf(scanner.nextInt());
        int[] arr = solution(num);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static int[] solution(long n) {
        String str = String.valueOf(n);

        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();

        String[] stringArr = sb.toString().split("");
        int[] answer = new int[sb.length()];

        int i = 0;
        for (String s : stringArr) {
            answer[i] = Integer.parseInt(s);
            i += 1;
        }

        return answer;
    }
}
