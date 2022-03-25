package 배열;

import java.util.ArrayList;
import java.util.Scanner;

public class 피보나치수열복습 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
                array[i] = array[i - 2] + array[i - 1];
        }

        for (Integer data : array) {
            System.out.print(data + " ");
        }
    }
}
