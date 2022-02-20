package 배열;

import java.util.Scanner;

public class BaekJoon_2562_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i] = scanner.nextInt();
        }

        int maxIndex = 0;
        int max = 0;
        for (int j = 0; j < array.length; j++) {

            if (max < array[j]) {
                max = array[j];
                maxIndex = j + 1;
            }
        }

        System.out.print(max + "\n" + maxIndex);
    }
}
