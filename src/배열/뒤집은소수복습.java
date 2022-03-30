package 배열;

import java.util.Scanner;

public class 뒤집은소수복습 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] array = new String[n];

        StringBuffer sb = null;

        int[] numbers = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();

            sb = new StringBuffer(array[i]).reverse();
            numbers[i] = Integer.parseInt(sb.toString());
        }

        for (Integer reverseNum : numbers) {
            System.out.print(reverseNum + " ");
        }

        System.out.println();


        for (int j = 0; j < numbers.length; j++) {
            int cnt = 0;
            if (numbers[j] > 1) {
                for (int k = 2; k < numbers[j]; k++) {
                    if (numbers[j] % k == 0) {
                        cnt += 1;
                    }
                }

                if (cnt < 1 ) {
                    System.out.print(numbers[j] + " ");
                }
            }

        }




    }
}
