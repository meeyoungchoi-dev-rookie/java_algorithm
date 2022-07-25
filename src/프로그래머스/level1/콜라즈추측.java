package 프로그래머스.level1;

import java.util.Scanner;

public class 콜라즈추측 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        long num = n;
        int count = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            count += 1;

            if (count > 500) {
                return -1;
            }
        }

        return count;
    }
}
