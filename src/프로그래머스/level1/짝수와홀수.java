package 프로그래머스.level1;

import java.util.Scanner;

public class 짝수와홀수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(solution(number));
    }

    public static String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
}
