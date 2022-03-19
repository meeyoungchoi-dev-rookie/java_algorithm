package 문자열;

import java.util.Scanner;

public class 문자열압축복습 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        str = str.toUpperCase();
        str += " ";

        char[] array = str.toCharArray();

        String result = "";

        int cnt = 1;
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] == array[j + 1]) {
                cnt += 1;
            } else {
                result += array[j];
                if (cnt > 1) {
                    result += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }

        System.out.println("result: " + result);
    }
}
