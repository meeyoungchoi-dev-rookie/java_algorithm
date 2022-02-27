package 배열;

import java.util.Scanner;

public class OxQuiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }

        scanner.close();

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            int sum = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    cnt += 1;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}
