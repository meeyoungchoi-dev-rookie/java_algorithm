package 배열;

import java.util.Scanner;

public class 에라토스테네스체 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        int num = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
            num += 1;
        }

        // 시간복잡도 1씩 늘어나니까 n제곱
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1) {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        array[i] = 0;
                        continue;
                    }
                }

                if (array[i] != 0) {
                    System.out.println(array[i]);
                    count += 1;
                }
            }
        }

        System.out.println("소수의 개수: " + count);
    }
}
