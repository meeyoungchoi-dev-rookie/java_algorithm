package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2562 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[9];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println(array[array.length - 1]); // 가장 큰 값
        System.out.println(array.length - 1); // 가장 큰 값의 인덱스


    }
}
