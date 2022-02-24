package 배열;

import java.util.Scanner;

public class 나머지 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        int[] remains = new int[42];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int data : numbers) {
            int remain = data % 42;
            remains[remain] ++;
        }

        int count = 0;
        for (int j = 0; j < remains.length; j++) {
            if (remains[j] != 0) {
                count += 1;
            }
        }

        System.out.println("result: " + count);
    }
}
