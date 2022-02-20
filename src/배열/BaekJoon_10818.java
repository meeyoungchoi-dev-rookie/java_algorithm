package 배열;

import java.util.Scanner;

public class BaekJoon_10818 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }


        // 최소
        int min = array[0];

        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }

        System.out.println("최솟값: " + min);

       // 최대
        int max = 0;
        for (int k = 0; k < array.length; k++) {
            if (array[k] > max) {
                max = array[k];
            }
        }

        System.out.println("최댓값: " + max);

    }



}
