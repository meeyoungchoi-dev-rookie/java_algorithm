package 배열;

import java.util.Scanner;

public class 등수구하기 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] scoreArray = new int[n];

        for (int i = 0; i < scoreArray.length; i++) {
            scoreArray[i] = scanner.nextInt();
        }

        int[] ranks = new int[n];
        for (int j = 0; j < scoreArray.length; j++) {
           int rank = 1;
           for (int  k = 0; k < scoreArray.length; k++) {
               if (scoreArray[j] < scoreArray[k]) {
                   rank += 1;
               }
           }
           ranks[j] = rank;
        }

        for (Integer data : ranks) {
           System.out.print(data + " ");
        }
    }
}
