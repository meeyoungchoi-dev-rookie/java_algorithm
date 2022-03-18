package 문자열;

import java.util.Scanner;

public class 가장짧은문자거리복습 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char t = scanner.next().charAt(0);


        char[] array = str.toCharArray();

        int[] result = new int[array.length];

        int d = 1;

        for (int i = 0; i<= array.length - 1; i++) {
            if (t == array[i]) {
                d = 0;
                result[i] = d;
                d = 1;
            } else {
                result[i] = d;
                d += 1;
            }
        }

        for (int j = array.length - 1; j >= 0; j--) {
            if (t == array[j]) {
                d = 0;
                result[j] = d;
                d = 1;
            }

            if (result[j] > 2) {
                result[j] = d;
                d += 1;
            }
        }

        for (int l : result) {
            System.out.print(l + " ");
        }
    }
}
