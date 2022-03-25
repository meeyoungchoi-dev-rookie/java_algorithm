package 배열;


import java.util.ArrayList;
import java.util.Scanner;

public class 보이는학생복습 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;
        for (int j = 0; j <= array.length - 2; j++) {
            if (j == 0) {
                count += 1;
            }
            else if (array[j] < array[j + 1]) {
                System.out.println(array[j + 1]);
                count += 1;
            }
        }
        System.out.println(count);
    }
}
