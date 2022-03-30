package 배열;

import java.util.Scanner;

public class 뒤집은소수복습2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            int temp = array[i];
            System.out.println("뒤집기전 숫자 : " + temp);
            int res = 0;
            while (temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }

            temp = res;
            array[i] = temp;
            System.out.println("뒤집은 후 숫자: " + array[i]);
        }

        for (int j = 0; j < array.length; j++) {
            int cnt = 0;
            if (array[j] > 1) {
                for (int k = 2; k < array[j]; k++) {
                    if (array[j] % k == 0) {
                        cnt += 1;
                    }
                }

                if (cnt < 1 ) {
                    System.out.print(array[j] + " ");
                }
            }
        }
    }
}
