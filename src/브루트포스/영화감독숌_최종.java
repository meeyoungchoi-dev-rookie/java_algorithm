package 브루트포스;

import java.util.Scanner;

public class 영화감독숌_최종 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        while (n > 0) {
            cnt++;

            String temp = String.valueOf(cnt);

            if (temp.contains("666")) {
                n--;
            }
        }

        System.out.println("cnt: " + cnt);
    }
}
