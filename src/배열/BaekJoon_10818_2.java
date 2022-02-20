package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_10818_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println(array[0] + " " + array[array.length - 1]);


    }
}
