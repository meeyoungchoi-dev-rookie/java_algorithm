package 브루트포스;

import java.util.Scanner;

public class 영화감독숌_세번째풀이 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();

        int title = 666;
        int cnt = 1;

        while (index != cnt) {
            title += 1;
            System.out.println("title: " + title);

            if (String.valueOf(index).contains("666")) {
                cnt += 1;
                System.out.println("cnt: " + cnt);
            }
        }

        System.out.println(title);
    }
}
