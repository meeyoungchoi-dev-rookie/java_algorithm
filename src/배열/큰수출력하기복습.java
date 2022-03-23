package 배열;

import java.util.Scanner;

public class 큰수출력하기복습 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }


        for (int j = 0; j <= array.length - 2; j++) {
           if (j == 0) {
               System.out.print(array[j] + " ");
           } else if (array[j] < array[j + 1]) {
               System.out.print(array[j + 1] + " ");
           }
        }
    }
}
