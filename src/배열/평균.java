package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class 평균 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        Arrays.sort(scores);

        int max = scores[scores.length - 1];
        System.out.println("max: " + max);

        double total = 0;
        for (int j = 0; j < scores.length; j++) {
            total += (((double) scores[j] / (double) max) * 100);
        }


        double average = total / (double) scores.length;
        System.out.println(average);
    }
}
